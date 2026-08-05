package SOLVED;

public class Problem_693 {
    public static void main (String[] args ) {
        int n = 6  ;
        int oldbit = n & 1  ;
        int  currentbit = 0 ;
        n >>= 1 ;
        while(n > 0 ){

            currentbit = n & 1  ;
            if(currentbit == oldbit){
                System.out.println("false");
            }
            oldbit = currentbit ;
            n >>=1 ;
        }

    }
}
