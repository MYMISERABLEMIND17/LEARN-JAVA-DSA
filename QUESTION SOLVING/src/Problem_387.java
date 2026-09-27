import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem_387 {
    public static void main(String[] args) {
        String s = "aabb" ;
        HashMap<Character , Integer> map = new HashMap<>() ;
        for (int i = 0 ; i <s.length() ; i++ ){
            char ch  = s.charAt(i) ;
            map.put(ch , map.getOrDefault( ch  , 0 ) +1) ;
        }
        System.out.println(map);

        ArrayList<Character> ch = new ArrayList(map.keySet())  ;
        ArrayList<Integer> in =  new ArrayList(map.values()) ;
        int count=  -1 ;
        char keyy = 'a' ;
        for (int i  = 0 ; i < ch.size() ; i++ ){
            if(in.get(i).equals(1) ){
                count = i ;
                keyy = ch.get(i) ;
            }
        }
//        return ch.get(count);
        System.out.println(ch.get(count));
        if(count > -1){
            for(int i = 0 ; i < s.length() ; i++) {
                if(s.charAt(i) == (ch.get(keyy))){
//                    return i  ;
                    System.out.println(i);
                }
            }
        }
//        return -1 ;

        System.out.println(-1);
    }
}
