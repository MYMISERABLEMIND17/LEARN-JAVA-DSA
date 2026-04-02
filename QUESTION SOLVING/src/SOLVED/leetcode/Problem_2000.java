package SOLVED.leetcode;

public class Problem_2000 {
    public static void main(String[] args) {
        String word = "abcdefd" ;
        char ch = 'd' ;
        logic(word , ch);
    }
    static String logic(String word , char ch){

        int i =0 ;
        while(i < word.length()){
            if( word.charAt(i) == ch){
                break ;
            } else if (i == word.length()-1) {
                return word ;
            }
            i++;
        }
        System.out.println(i);

        StringBuilder str = new StringBuilder(word) ;
        int left = 0 ;
        int right = i ;

        while(left <= right){
            char temp = str.charAt(left) ;
            str.setCharAt(left , str.charAt(right));
            str.setCharAt(right , temp) ;

            left++ ;
            right-- ;
        }
        String result = str.toString();
        System.out.println(result);
        return result ;


    }
}
