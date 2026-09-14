import java.util.HashMap;

public class Problem_1358 {
    public static void main(String[] args) {
        String s = "abcabc" ;
        // insert first 3 letters
        int start = 0 ;
        int end  = s.length() ;
        int i = 3 ;
        int count  = 0 ;

        HashMap<Character , Integer> map = new HashMap<>() ;

        for (int j = 0; j < i; j++) {
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j) , map.get(s.charAt(j))+1) ;
            }
            else{
                map.put(s.charAt(j) , 1) ;
            }
        }

        if(map.size() >= 3 ){
            count = count +  end - i+1  ;
        }

//
        while (i < end   ){
            char right = s.charAt(i) ;
            map.put(right , map.getOrDefault(right , 0 ) +1 ) ;


            char left  = s.charAt(start) ;
            map.put(left  , map.getOrDefault(left  ,  0 ) - 1 ) ;
            if(map.get(left) == 0 ){
                map.remove(left ) ;
            }
            start++ ;

            if(map.size() >= 3 ){
                count  = count + end - i ;
            }
            i++ ;
        }
        System.out.println(count);
    }
}
