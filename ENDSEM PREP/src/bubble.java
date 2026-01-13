import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] myarr = {2,5,1,7,3,9,4,6,2} ;

        for(int i = 0 ; i<= myarr.length-1 ; i++ ){
            for(int j = 1 ; j<= myarr.length-1; j++ ){
                if(myarr[j]<myarr[j-1]){
                    // swap
                    int temp = 0 ;
                    temp = myarr[j];
                    myarr[j] = myarr[j-1];
                    myarr[j-1] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(myarr));
    }

}
