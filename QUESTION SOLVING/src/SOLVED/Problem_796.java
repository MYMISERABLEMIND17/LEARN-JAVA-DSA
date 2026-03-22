package SOLVED;

public class Problem_796 {
    public static void main(String[] args) {
        String s = "abcde" ;
        String goal = "cdeab" ;

        System.out.println(logic(s ,goal ));
    }
    static boolean logic(String s , String goal ){
        int count  = 0 ;
        StringBuilder sx = new StringBuilder(s) ;

        while (count < s.length() ){
            char temp = sx.charAt(0) ;
            for (int i = 1; i <sx.length() ; i++) {
                sx.setCharAt(i-1 , sx.charAt(i));
            }
            sx.setCharAt(sx.length()-1 , temp);
            count++ ;
            if(sx.toString().equals(goal)){
                return true ;
            }

        }


        System.out.println(sx);
        System.out.println(goal);
        return false  ;
    }
}
