import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays ;

public class Problem_350 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5} ;
        int[] nums2 = {9,4,9,8,4} ;
        logic(nums1 , nums2);
    }

    static void logic(int[] n1 , int[] n2){
        ArrayList<Integer> x = new  ArrayList<Integer>() ;
        for(int i = 0  ; i < n1.length  ; i++ ){
            for(int j = 0  ; j < n2.length ; j++ ){
                if(n1[i] == n2[j]){
                    x.add(n1[i]) ;
                    n2[j] = -1  ;
                    break ;
                }
            }
        }
        int[] arr = new int[x.size()] ;
        for(int a = 0 ; a < x.size() ; a++){
            arr[a] = x.get(a) ;
        }
        System.out.println(Arrays.toString(arr)) ;



    }
}
