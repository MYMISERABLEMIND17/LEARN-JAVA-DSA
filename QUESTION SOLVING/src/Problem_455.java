import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_455 {
    public static void main(String[] args) {
        int[] a = {10,9,8,7};
        int[] b = {5,6,7,8};

        System.out.println(logic(a, b));
    }

    static int logic(int[] child, int[] cook) {
            Arrays.sort(child);
            Arrays.sort(cook);
            int count = 0;
            int i = 0;
            int j = 0;
            while (i < child.length && j < cook.length) {
                if (cook[j] >= child[i]) {
                    count++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            return count;
    }
}