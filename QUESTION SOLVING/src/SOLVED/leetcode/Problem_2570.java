package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_2570 {
    public static void main(String[] args ){
        int[][] nums1 = {{1,2},{2,3},{4,5}} ;
        int[][] nums2 = {{1,4},{3,2},{4,1}} ;
        logic(nums1, nums2 );
    }
    static void logic(int[][] n1  , int[][] n2){
        int[][] arr = new int[n1.length + n2.length][2] ;
        int  counter = 0 ;
        System.out.println(n1[0][1]) ;

        int i = 0 ;
        int j = 0 ;
        while(i < n1.length && j < n2.length){
            if(n1[i][0] == n2[j][0]){
                int id = n1[i][0] ;
                int val = n1[i][1] + n2[j][1] ;
                arr[counter][0] = id ;
                arr[counter][1] = val ;
                counter++;
                j++ ;
                i++ ;
            }
            else if(n1[i][0] < n2[j][0]){
                int id = n1[i][0] ;
                int val = n1[i][1] ;
                arr[counter][0] = id ;
                arr[counter][1] = val ;
                i++ ;
                counter++ ;
            }
            else if(n1[i][0] > n2[j][0]){
                int id = n2[j][0] ;
                int val = n2[j][1] ;
                arr[counter][0] = id ;
                arr[counter][1] = val ;
                j++ ;
                counter++ ;
            }
        }
        // Remaining elements of n1
        while (i < n1.length) {
            arr[counter][0] = n1[i][0];
            arr[counter][1] = n1[i][1];
            counter++;
            i++;
        }

        // Remaining elements of n2
        while (j < n2.length) {
            arr[counter][0] = n2[j][0];
            arr[counter][1] = n2[j][1];
            counter++;
            j++;
        }

        int len = 0 ;
        for(int a = 0 ;a < arr.length ; a++ ){
            if(arr[a][0] != 0 ){
                len++ ;
            }
        }
        System.out.println(len) ;

        int[][] last = new int[len][2] ;
        for(int c = 0 ; c < len ; c++){
            last[c][0] = arr[c][0] ;
            last[c][1] = arr[c][1];
        }
        System.out.println(Arrays.deepToString(last)) ;
    }
}
