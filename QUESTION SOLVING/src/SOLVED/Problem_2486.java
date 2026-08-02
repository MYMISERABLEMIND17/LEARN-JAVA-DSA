package SOLVED;

public class Problem_2486 {
    public static void main(String[] args ){
        String s = "z" ;
        String t = "abcde" ;
        logic(s , t ) ;
    }
    static void logic(String a , String b){
        int i = 0  ;
        int j = 0 ;
        int count = 0  ;
        while(i < b.length()){
            if(a.charAt(j) == b.charAt(i)){
                i++ ;
                j++ ;
            }
            else if(a.charAt(j) != b.charAt(i) && j == a.length()-1 ){
                i++ ;
                count++ ;
            }
            else{
                j++ ;
            }
        }
        System.out.println(count) ;
    }
}
