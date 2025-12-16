import java.util.Arrays;
import java.util.Scanner;

public class Problem_1365 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in );
        System.out.print("ENTER THE TOTAL NUMBERS = ");
        int elem = inp.nextInt() ;
        int[] myarr = new int[elem];
        int[] opt = new int[elem] ;
        input(myarr , elem);

        logic(myarr , opt);

    }
    static void logic(int[] arr , int[] array){
        for(int i =0 ; i<= arr.length-1 ;i++){
            int count = 0 ;
            for(int j = 0 ; j<= arr.length -1 ; j++){
                if(arr[j] <arr[i] ){
                    count = count+1 ;
                }
            }
            array[i] = count ;
        }
        System.out.println(Arrays.toString(array));
    }


    static void input(int[] arr , int elem ){
        Scanner inp = new Scanner(System.in );
        for( int i = 0 ; i<= elem-1 ; i++ ){
            arr[i]= inp.nextInt() ;
        }
        System.out.println(Arrays.toString(arr));


    }
}
