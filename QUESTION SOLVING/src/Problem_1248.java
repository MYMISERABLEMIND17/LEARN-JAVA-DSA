import java.util.HashMap;

public class Problem_1248 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1} ;
        int k = 3 ;

        HashMap<String , Integer > map = new HashMap<>() ;
        map.put("even" , 0 ) ;
        map.put("odd"  ,  0 ) ;

        int i= 0 ;
        while (map.get("odd") != k){
            if(oddcheck(nums[i]) == true){
                map.put("odd" , map.getOrDefault("odd" , 0) +1 ) ;
            }
            else{
                map.put("even" , map.getOrDefault("even" , map.getOrDefault("even" ,  0 ) +1 )) ;
            }
            i++ ;
        }
        System.out.println(map);

    }
    static boolean oddcheck(int num){
        if(num % 2 != 0 ){
            return true ;
        }
        else{
            return false ;
        }
    }
}
