package SOLVED.leetcode;

public class Problem_151 {
    public static void main(String[] args) {
        String s  = "a good example" ;
        logic(s);
    }
    static String logic(String str){
        StringBuilder ans = new StringBuilder() ;
        StringBuilder temp = new StringBuilder() ;
        int i = 0 ;
        while(i < str.length()){

            if(str.charAt(i) == ' ' ){
                ans.insert(0 , temp+" ") ;
                temp.delete(0 , temp.length()) ;
            }
            else{
                temp.append(str.charAt(i)) ;
            }
            i++ ;
        }

        if(temp.length() > 0) {
            ans.insert(0 , temp +" " ) ;
        }


        String result = ans.toString() ;
        result = result.replaceAll("\\s+", " ");
        result = result.trim() ;
        return result  ;

    }
}
