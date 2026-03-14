import java.util.Arrays;

public class Problem_605 {
    public static void main(String[] args) {
        int[] fb = {1,0,0,0,1} ;
        int n = 1 ;

        System.out.println(logic(fb , n ));
    }
    static boolean logic(int[] fb , int n ){
        int count = 0 ;
        int alreadyones = 0 ;
        for (int i = 0; i < fb.length ; i++) {
            if(fb[i] ==1 ){
                alreadyones++ ;
            }

            if(i == 0&& fb[i+1]==0){
                fb[i] = 1 ;
                count++ ;
            }
            else if(i == fb.length-1 &&  fb[i-1] == 0){
                fb[i] = 1 ;
                count++;
            }

            else if(i != 0 &&  fb[i-1] == 0 && fb[i+1]==0 && i!= fb.length-1  ){
                fb[i] = 1 ;
                count++ ;
            }

        }

        System.out.println(Arrays.toString(fb));
        System.out.println(count-alreadyones);
        if((count-alreadyones )== n ){
            return true ;
        }
        return false ;
    }
}
