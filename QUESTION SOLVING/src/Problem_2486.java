import java.util.Arrays;

public class Problem_2486 {
    public static void main(String[] args){
        String  s = "coaching" ;
        String t = "coding" ;
        StringBuilder str1 = new StringBuilder(s) ;
        StringBuilder str2 = new StringBuilder(t) ;
        logic(str1 , str2 );
    }
    static void logic(StringBuilder  s1 , StringBuilder s2){


        int count = 0 ;
        for(int i = 0  ; i < s2.length() ; i++ ){

            for(int j = 0 ; j < s1.length() ; j++ ){
                if(s2.charAt(i) == s1.charAt(j)){
                    s1.setCharAt(j , '.') ;
                    break ;
                }
                else if (j == s1.length()-1){
                    count++ ;
                }
            }

        }
        System.out.println(s1) ;
        System.out.println(count) ;
    }
}
