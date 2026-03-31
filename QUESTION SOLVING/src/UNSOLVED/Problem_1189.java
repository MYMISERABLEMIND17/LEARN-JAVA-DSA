package UNSOLVED;

import java.util.Arrays;

public class Problem_1189 {
    public static void main(String[] args) {
        String text = "loonbalxballpoon" ;
        logic(text) ;
    }
    static void logic(String str){
         String word = "balloon" ;
         int[] arr = new int[word.length()] ;
         int j = 0 ;
         int i = 0 ;
        System.out.println(str.length());
         while( j < word.length()){
             if(word.charAt(j) == str.charAt(i) ){
                 arr[j] = arr[j]+1;
             }

             if(i == str.length()-1){
                 j++ ;
                 i = 0 ;
             }
             i++ ;
         }
        System.out.println(Arrays.toString(arr));

         // balloon

    }
}
