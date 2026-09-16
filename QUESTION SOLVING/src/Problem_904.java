import java.util.HashMap;

public class Problem_904 {
    static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int start = 0 ;
        int maxsum = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int  i =  0  ;
        int currentlen = 0 ;
        while ( i < fruits.length) {
            int n = fruits[i] ;
            map.put(n , map.getOrDefault(n , 0 ) +1  ) ;
            if(map.size() > 2 ){
                while (map.size() > 2){
                    map.put(fruits[start] , map.getOrDefault(fruits[start] , 0 ) -1 ) ;
                    int c = map.getOrDefault(fruits[start] ,  0 ) ;
                    if(c == 0 ){
                        map.remove(fruits[start]) ;
                    }
                    start++ ;
                }

            }
            int sum = 0  ;
            for(int val : map.values() ){
                sum = sum + val ;
            }
            maxsum = Math.max(maxsum , sum ) ;
            i++;
        }
        System.out.println(map);

        System.out.println(maxsum );

    }
}