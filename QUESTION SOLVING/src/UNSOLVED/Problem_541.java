package UNSOLVED;

public class Problem_541 {
    public static void main(String[] args) {
        String  s = "abcdefg" ;
        int k = 8 ;
        logic(s,k);
    }
    static void logic(String nums , int k ){
        StringBuilder x  = new StringBuilder(nums) ;
        if(nums.length() > k ){
            int end = k ;
            int start = 0 ;
            int i  = 0  ;
            while (i < (end/2)){
                char temp = x.charAt(start) ;
                x.setCharAt(start, x.charAt(end-i-1));
                x.setCharAt(end-i-1 , temp);
                i++  ;
            }
            String result  = x.toString() ;
        }
        if(nums.length()  <  k ){
            int i = 0 ;
            int start = 0 ;
            int end = nums.length() ;
            while (i < (end/2)){
                char temp = x.charAt(start) ;
                x.setCharAt(start, x.charAt(end-i-1));
                x.setCharAt(end-i-1 , temp);
                i++  ;
            }
            String result  = x.toString() ;
            System.out.println(result);
        }

    }
}
