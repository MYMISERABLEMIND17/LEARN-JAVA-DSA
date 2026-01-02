public class Problem_961 {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4} ;

        System.out.println(logic(nums));
    }
    static int logic(int[] arr){
        int a = 0 ;
        int i =  1 ;
        int number = 0 ;
        int count = 0 ;
        while(i<arr.length){
            if(arr[i] == arr[a] ){
                  return arr[a] ;
            }
            else if (i == arr.length - 1) {
                a++ ;
                i = a ;
            }
            i++ ;
        }
        return 0 ;
    }
}
