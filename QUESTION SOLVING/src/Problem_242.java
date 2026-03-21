import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem_242 {
    public static void main(String[] args) {
        String s = "anagram" ;
        String t = "nagaram" ;


        System.out.println(logic(s , t ));
    }
    static boolean logic (String s, String t){
        char[] s1 = s.toCharArray() ;
        char[] t1 = t.toCharArray() ;

        Arrays.sort(s1);
        Arrays.sort(t1);
//        if(s1.length == t1.length){
//            for (int i = 0; i < s1.length; i++) {
//                if(s1[i] != t1[i]){
//                    return false ;
//                }
//            }
//            return true  ;
//        }
//        else{
//            return false ;
//        }

//        System.out.println(s1);
//        System.out.println(t1) ;

                if(Arrays.equals(s1, t1) == true){
                    return true ;
                }
                return false ;
    }
}
