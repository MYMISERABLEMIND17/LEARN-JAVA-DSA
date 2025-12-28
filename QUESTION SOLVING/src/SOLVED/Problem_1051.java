package SOLVED;

public class Problem_1051 {
    public static void main(String[] args) {
        int[] height = {1,1,4,2,1,3} ;
        int[] expected = new int[height.length]  ;

        sort(height , expected);
    }
    static void sort(int[] height  , int[] expected){
        // creating duplicate array
        for (int i = 0; i < expected.length ; i++) {
            int temp = height[i] ;
            expected[i] = temp ;
        }

        // now time to sort the expected array

        for (int j = 0; j < expected.length ; j++) {
            int min = j  ;
            for (int k = j+1 ; k <expected.length ; k++) {
                 if(expected[k] < expected[min] ){
                     min = k ;

                 }
            }
            int temp = expected[j]  ;
            expected[j] = expected[min ] ;
            expected[min] = temp ;
        }
        int count = 0 ;
        for (int x = 0; x < expected.length; x++) {

            if(height[x] != expected[x]){
                count ++ ;
            }
        }
        System.out.println(count);

    }

}
