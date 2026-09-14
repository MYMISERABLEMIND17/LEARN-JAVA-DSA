package SOLVED;

import java.util.HashMap;

public class Problem_3 {
    public static void main(String[] args) {
        String s = "abcabcbb" ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        int start = 0  ;
        int current  = 0;

        int maxlen = 0 ;
        int len = 0 ;
        for(int i  = 0 ; i < s.length() ; i++ ) {
            current = i;
            char mychar = s.charAt(i);


            if (map.containsKey(mychar)) {
                map.put(mychar , map.getOrDefault(mychar , 0 ) +1 ) ;
                while (map.get(mychar) > 1) {
                    map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                    start++;
                }


                len = current - start + 1 ;
                maxlen = Math.max(len, maxlen);

            } else {
                map.put(mychar , map.getOrDefault(mychar , 0 ) +1 ) ;
                len = current - start + 1 ;
                maxlen = Math.max(len, maxlen);
            }

            System.out.println(maxlen);

        }
    }
}
