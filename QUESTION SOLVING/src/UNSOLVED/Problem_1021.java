package UNSOLVED;

public class Problem_1021 {
    public static void main(String[] args) {
        String s = "(()())(())" ;
        logic( s );
    }
    static void logic(String s ){
        StringBuilder str = new StringBuilder(s) ;
        // first  print all the chars in the string
        // use 2 pointer and make sure the to use count variable ;
        int i = 0 ;
        int j = 0 ;
        int open = 0 ;
        while( i < str.length()){
            System.out.println(str.charAt(i));

            if(str.charAt(i) == '(' ){
                open++ ;
            } else if (str.charAt(i) == ')') {
                open--;
            }
            if(open == 0 ){
                System.out.println( i + " " + j );
                str.deleteCharAt(i) ;
                str.deleteCharAt(j) ;
                j = i ;
            }

            i++ ;
        }
        System.out.println(str);

    }
}
