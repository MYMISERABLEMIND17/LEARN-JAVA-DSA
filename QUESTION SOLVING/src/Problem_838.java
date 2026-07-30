import java.util.Arrays;

public class Problem_838 {
    public static void  main (String[ ] args ){
        String dom  = ".L.R...LR..L.." ;
        logic(dom) ;
    }
    static void logic(String numss ){
        StringBuilder nums = new StringBuilder(numss) ;
        System.out.println(nums.length()) ;

        int i = 0 ;
        int j = 0 ;
        int front = 0 ;
        int back = 0 ;

        while(i < nums.length()){
            if(nums.charAt(j) == '.' && nums.charAt(i) == 'L'){
                back = j ;
                front = i ;
                while (back <= front){
                    nums.setCharAt(front , 'L') ;
                    front-- ;
                }
                j = i+1 ;
            }
            else if( nums.charAt(j) == '.' && nums.charAt(i) == 'R'){
                j = i ;
            }
            else if ( nums.charAt(j) == 'R' && nums.charAt(i) == 'L'){
                front = i ;
                back = j  ;
                while(back <  front ){
                    nums.setCharAt(front , 'L') ;
                    front-- ;
                    nums.setCharAt(back ,'R' ) ;
                    back++ ;
                }
                j = i+1 ;
            }


            i++ ;


        }

        System.out.println(nums) ;
        String x  = nums.toString() ;
//        return x  ;

    }
}
