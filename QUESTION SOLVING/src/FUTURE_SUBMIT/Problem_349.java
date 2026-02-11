package FUTURE_SUBMIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
    import java.util.Set;

    public class Problem_349 {
        public static void main(String[] args) {
            int[] nums1 = {4,9,5};
            int[] nums2 = {9,4,9,8,4} ;

            System.out.println(logic(nums1 , nums2));
        }
        static int[] logic(int[] arr1 , int[] arr2 ){

                Set<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j <arr2.length ; j++) {
                        if(arr1[i] == arr2[j]){
                            set.add(arr2[j]);
                        }
                    }
                }
                ArrayList<Integer> list = new ArrayList<>(set);
                int[] result = new int[set.size()];

                for (int k = 0; k <set.size() ; k++) {
                    result[k] = list.get(k);
                }
                System.out.println(Arrays.toString(result));
                return result  ;
        }

    }