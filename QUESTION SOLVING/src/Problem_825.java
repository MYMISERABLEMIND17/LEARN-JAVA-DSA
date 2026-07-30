import java.util.* ;
public class Problem_825 {
    public static void main(String[] args) {
        int[] nums  = {20 ,20,30,100,110,120} ;
        logic(nums);
    }
    static void logic(int[] arr){
        int requests = 0 ;
        Arrays.sort(arr) ;

        // if ages are equal the what willbe the also , the req +2 ;
        int i = 0 ;
        while(i < arr.length){
            int j = i+1  ;
            while(j < arr.length ){
                if(arr[i] == arr[j] ){
                    requests = requests +2 ;
                }
                else if(arr[i] != arr[j] && arr[j] <= 0.5 * arr[i] + 7 && arr[j] > arr[i] && arr[j] > 100 && arr[i] < 100 ){
                    j++ ;
                    break ;
                }
                else{
                    requests++;
                }




                j++ ;
            }
            i++ ;
        }
        System.out.println(requests)  ;

    }
}
