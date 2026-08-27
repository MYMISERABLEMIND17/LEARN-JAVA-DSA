import java.util.Arrays;

public class Problem_2037 {
    public static void main(String[] args){
        int[] seats = {12,14,19,19,12} ;
        int[] students = {19,2,17,20,7} ;
        logic(seats , students) ;
    }
    static void logic(int[] se , int[] st){
        Arrays.sort(se);
        Arrays.sort(st) ;

        System.out.println(Arrays.toString(se)) ;
        System.out.println(Arrays.toString(st)) ;
        int step = 0  ;
        for(int i = 0 ; i < se.length ; i++ ){
            if(se[i] > st[i]){
                step = step +( se[i] - st[i]) ;
            }
            else{
                step = step +( st[i] - se[i]) ;
            }

        }
        if(step  < 0 ){
            System.out.println(step* -1) ;
        }
        System.out.println(step) ;
    }

}
