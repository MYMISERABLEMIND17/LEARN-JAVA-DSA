import java.util.Arrays;
import java.util.HashMap;

public class Problem_930 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }


        System.out.println(Arrays.toString(pref));


    }
}
