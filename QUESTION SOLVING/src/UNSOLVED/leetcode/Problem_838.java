import java.util.Arrays;

public class Problem_838 {
    public static void  main (String[ ] args ){
        String dom  = "L...LR..L.." ;
        logic(dom) ;
    }
    static void logic(String numss ){
        StringBuilder nums = new StringBuilder(numss) ;
        System.out.println(nums) ;

        int i = 0 ;
        int j = -1 ;
        int left  = 0 ;
        int right  = 0 ;

        while (i < nums.length()){

            if(j == -1 && nums.charAt(i) == 'L'){
                left = j ;
                right = i ;
                while(left < right ){
                    left++ ;
                    nums.setCharAt(left , 'L');

                }
                j = i ;

            }
            else if(i == nums.length()-1 && nums.charAt(j) == 'R' && nums.charAt(i) =='.'){
                left = j ;
                right = i  ;
                while(left <= right){
                    left++ ;
                    nums.setCharAt(left , 'R');

                }
            }




            else if(nums.charAt(j) == 'L' && nums.charAt(i) == 'L'){
                left = j ;
                right = i ;
                while(left < right){
                    right-- ;
                    nums.setCharAt(right , 'L');

                }
                j = i ;
            }


            else if(nums.charAt(j) == 'R' && nums.charAt(i) == 'L'){
                left = j ;
                right = i ;
                while (left < right){
                    left++ ;
                    right-- ;
                    nums.setCharAt(left , 'R');
                    nums.setCharAt(right , 'L');

                }
                j =  i  ;

            }

            if (j != -1 && nums.charAt(j) == 'R') {

                left = j + 1;

                while (left < nums.length()) {
                    nums.setCharAt(left, 'R');
                    left++;
                }
            }



            i++ ;

        }

        String  str = nums.toString() ;
        System.out.println(str);



    }
}
