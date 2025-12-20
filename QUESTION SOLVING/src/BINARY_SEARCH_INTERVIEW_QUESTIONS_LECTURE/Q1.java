package BINARY_SEARCH_INTERVIEW_QUESTIONS_LECTURE;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,12,14,17,19} ;
        int target  = 12 ;
        // smallent number in array greater than the array

        int min = 0  ;
        int max = arr.length ;

        int mid =( min + max )/2  ;
        while(min<=max){
            if(target == arr[mid]){
                System.out.println(arr[mid]);
            } else if (target > arr[mid]) {
                min = mid+1 ;
            } else if (target<arr[mid]) {
                max = mid -1 ;
            }else{
                System.out.println(arr[mid-1]);
            }
        }

    }
}
