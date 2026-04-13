import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
        String jewels = "aA" ;
        String stones = "aAAbbbb" ;
        logic(jewels , stones);
    }
    static void logic(String jewels , String  stones){
        HashMap<Character , Integer> maps = new HashMap<>() ;
        int count  = 0 ;
        for (int i = 0; i < stones.length(); i++) {
            maps.put(stones.charAt(i),maps.getOrDefault(stones.charAt(i) , 0 )+1 ) ;
        }
        for (int i = 0; i < jewels.length(); i++) {
            if(maps.containsKey(jewels.charAt(i))){
                count = count + maps.get(jewels.charAt(i)) ;
            }
        }
        System.out.println(count);
    }
}
