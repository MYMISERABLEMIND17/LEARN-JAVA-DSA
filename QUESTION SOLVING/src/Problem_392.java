import java.util.Arrays;

public class Problem_392 {
    public static void main(String[] args) {
        String s = "b" ;
        String t = "c" ;

        System.out.println(logic(s , t ));
    }
    static boolean logic(String s, String t){
        if(s.equals("")){
            return true ;
        }
        if(s.length() >= 1  ){
            int i = 0 ;
            int j = 0 ;
            while ( i < t.length()){
                if(s.charAt(j) == t.charAt(i)){
                    j++ ;
                }
                if(j == s.length()){
                    return true ;
                }
                i++;
            }
        }

        return false ;
    }
}
