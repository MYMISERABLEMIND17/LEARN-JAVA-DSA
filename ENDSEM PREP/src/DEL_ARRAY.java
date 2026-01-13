import java.util.Arrays;

public class DEL_ARRAY {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 15, 20};
        int n = 5;
        int pos = 2;   // index to delete

        // shift elements to the left
        for (int i = pos; i < arr.length-1 - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.println(Arrays.toString(arr));
    }
}
