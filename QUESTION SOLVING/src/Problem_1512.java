import java.util.Arrays;
import java.util.Scanner;

public class Problem_1512 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("how many element do you want  = ");
        int num = inp.nextInt();
        int[] nums = new int[num] ;

        input(nums, num);
        logic(nums) ;

    }
    static void input(int[] arr, int num){
        // take the input from the user;
        Scanner inp = new Scanner(System.in);
        for(int i = 0 ; i <=num-1 ; i++){
            arr[i] =inp.nextInt() ;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void logic(int[] arr){
        int count = 0 ;
        for (int i = 0; i <=arr.length ; i++) {
            for (int j = i+1; j <=arr.length-1; j++) {
                if(arr[i] == arr[j]){
                    count++ ;
                }
            }
        }
        System.out.println(count);
    }

}
