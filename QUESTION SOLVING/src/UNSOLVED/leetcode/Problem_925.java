package UNSOLVED.leetcode;

public class Problem_925 {
    public static void main(String[] args) {
       String  name = "alex" ;
       String typed = "aaleex" ;
        System.out.println(logic(name, typed));
    }
    static boolean logic(String  name , String typed){
        int i = 0 ;
        int j = 0 ;
        System.out.println(name.length());
        while(i<typed.length()){
            if(typed.charAt(i) == name.charAt(j)){
                j++ ;
            }
            else if (i > 0 && typed.charAt(i) == typed.charAt(i - 1)) {
                i++; // long press case
            }
            if(j == name.length()  ){
                return true ;
            }
            i++ ;
        }

        return false ;

    }
}
