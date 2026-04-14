package SOLVED;

import java.util.HashMap;

public class Problem_383 {
    public static void main(String[] args) {
        String  ransomNote = "aab" ;
        String magazine = "aab" ;
        logic(ransomNote , magazine);
    }
    static boolean logic(String r , String m){
        HashMap< Character , Integer > map = new HashMap<>() ;
        for (int i = 0; i < m.length() ;  i++) {
            map.put(m.charAt(i)  , map.getOrDefault(m.charAt(i) , 0 ) +1 ) ;
        }
        System.out.println(map);

        for (int i = 0; i < r.length()  ; i++) {
            if(map.containsKey(r.charAt(i))){
                int value = map.get(r.charAt(i)) ;
                if(value == 0 ){
                    return false ;
                }else{
                    value = value -1  ;
                    map.put(r.charAt(i) , value) ;
                }
            }
            else {
                return false ;
            }
        }
        System.out.println(map);
        return true ;

    }
}
