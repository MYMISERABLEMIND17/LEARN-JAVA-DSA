import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {

        System.out.print("enter the number = ");
        Scanner inp = new Scanner(System.in );
        int target = inp.nextInt();
        int[] ser = {1,4 ,6,8,12,56,78,90} ;
        int start = 0 ;
        int end = ser.length-1 ;

        while( start<=end ){
            int mid = (start+end)/2 ;
            if(ser[mid] == target){
                System.out.println("element found at " + mid);
                break;
            }


            else if ( target > ser[mid]) {
                start = mid+1 ;
            }

            else if(target<ser[mid]){
                end = mid-1  ;
            }
        }


    }
}
