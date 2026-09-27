import java.util.Arrays;

public class Problem_2300 {
    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] pot = {1, 2, 3, 4, 5};
        int success = 7;
        int maxc = 0;
        int[] arr = new int[spells.length] ;


        for (int i = 0; i < spells.length; i++) {
            int start = 0;
            int end = pot.length-1;
            int count = 0 ;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (pot[mid] * spells[i] > success) {
                    count += end - mid ;
                    end = mid -1 ;
                }
                else{
                    start = mid +1 ;
                }
            }
            arr[i] = count ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
