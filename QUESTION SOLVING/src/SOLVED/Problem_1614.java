package SOLVED;

public class Problem_1614 {
    public static void main(String[] args) {
        String s = "(()(()))" ;
        logic(s);
    }
    static void logic (String str){
        int depth  = 0 ;
        int temp = 0  ;
        int i = 0 ;
        while ( i < str.length()){
            if(str.charAt(i) == '('){
                temp++ ;
                if(temp > depth){
                    depth = temp ;
                }
            }
            else if (str.charAt(i) == ')' && temp > 0 ) {
                temp--  ;
            }
            i++ ;
        }
        System.out.println(depth);
    }
}
