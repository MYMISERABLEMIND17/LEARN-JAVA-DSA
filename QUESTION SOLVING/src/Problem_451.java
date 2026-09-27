import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Problem_451 {
    public static void main(String[] args) {
        String s = "cccbaaa" ;
        StringBuilder sb = new StringBuilder(s) ;
        HashMap<Character , Integer> map = new HashMap<>() ;

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            map.put(ch , map.getOrDefault(ch , 0 ) + 1) ;
        }
        System.out.println(map);

        ArrayList<Character> cc = new ArrayList<>(map.keySet()) ;
        ArrayList<Integer> ii = new ArrayList<>(map.values()) ;

        Collections.sort(ii);

        ArrayList<Character> ans = new ArrayList<>()  ;








    }
}
