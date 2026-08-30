package SOLVED;

public class Problem_1750 {
    public static void main(String[] args) {
        String s = "aabccabba" ;
        StringBuilder str = new StringBuilder(s) ; ;

        int i =0 ;
        int j = str.length()-1 ;
        int count  = 0 ;

        while (i < j && s.charAt(i) == s.charAt(j)){
            char c = str.charAt(i) ;

            while (i <= j   &&  str.charAt(i) == c ){
                i++ ;
                count++ ;
            }

            while ( j >= i &&   str.charAt(j) == c ){
                j-- ;
                count++ ;
            }

        }
        System.out.println(j - i +1 );
    }
}
