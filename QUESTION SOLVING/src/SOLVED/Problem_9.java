package SOLVED;

public class Problem_9 {
    public static void main(String[] args) {
        int x = 121 ;
        String str = x + "" ;
        for(int i  = 0 ; i < str.length()/2  ;  i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println(false);
            }
        }

    }
}
