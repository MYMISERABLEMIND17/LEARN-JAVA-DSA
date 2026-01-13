import java.util.Scanner;

public class LINEAR_SEARCH {
    public static void main(String[] args) {

        int[] Myarr = {2,5,3,4,7,9} ;
        System.out.print("enter the number = ");
        Scanner inp = new Scanner(System.in );
        int target = inp.nextInt();
        for( int i = 0  ; i <= Myarr.length-1  ; i++   ){
            if(Myarr[i] ==  target ){
                System.out.println("element found at  " +  i );
            }
            else{
                System.out.println("not found at " + i );
            }
        }

    }
}
