package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_3442 {
    public static void main(String[] args){
        String s = "mmsmsym";
        System.out.println(logic(s));
    }

    static int logic(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        int freq = 1;

        for (int i = 1; i <= arr.length; i++) {
            if (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
            } else {
                // a group just closed
                if (freq % 2 == 0) {
                    if (freq < minEven) {
                        minEven = freq;
                    }
                } else {
                    if (freq > maxOdd) {
                        maxOdd = freq;
                    }
                }
                freq = 1;
            }
        }

        return maxOdd - minEven;
    }
}