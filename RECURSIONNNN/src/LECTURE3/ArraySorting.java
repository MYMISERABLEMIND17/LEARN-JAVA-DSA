package LECTURE3;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4} ;
        int i = 0 ;
        System.out.println(findthearraysortedornot(arr , i ));
    }

    static boolean findthearraysortedornot(int[] arr , int i ){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]< arr[i+1] && findthearraysortedornot(arr , i+1) ;

    }


    // so basically if the i < j this the condition is true
    //    i++ , j++
}
