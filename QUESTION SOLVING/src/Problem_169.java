public class Problem_169 {
    public static void main(String[] args) {
        int[] arr ={6,6,6,7,7} ;

        System.out.println(logic(arr));
    }

    static int logic(int[] arr){
        int val = 0 ;
        int max = 0 ;
        if(arr.length == 1){
            val = arr[0]  ;
        }else{
            for (int i =0 ; i< arr.length ; i++){
            int count = 0 ;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j] ){
                    count++ ;
                }
            }
            if(count > max){
                max = count ;
                val = arr[i] ;
            }

        }
        }

        return val ;
    }

}
