import java.util.*;

public class Problem_1657 {
    public static void main(String[] args) {
        String word1 = "cabbba" ;  String word2 = "abbccc" ;
        char[] ch1 = word1.toCharArray() ;
        char[] ch2 = word2.toCharArray() ;
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        HashMap<Character , Integer> h1 = new HashMap<>() ;
        HashMap<Character , Integer> h2 = new HashMap<>() ;

        if(ch1.length != ch2.length ){
            System.out.println(false);
        }

        for (int i = 0; i < ch1.length; i++) {
            char c1 = ch1[i] ;
            h1.put(c1 , h1.getOrDefault(c1 , 0 ) +1 ) ;
            char c2 = ch2[i] ;
            h2.put(c2 , h2.getOrDefault(c2 , 0 ) +1 ) ;
        }
        System.out.println(h1);
        System.out.println(h2);


        ArrayList<Integer> l1 = new ArrayList<>(h1.values()) ;
        ArrayList<Integer> l2 = new ArrayList<>(h2.values()) ;
        ArrayList<Character> k1 = new ArrayList<>(h1.keySet())  ;
        ArrayList<Character> k2 = new ArrayList<>(h2.keySet()) ;

        Collections.sort(l1);
        Collections.sort(l2) ;
        Collections.sort(k1);
        Collections.sort(k2) ;


        int count = 0 ;
        for (int i = 0; i < ch1.length; i++) {
            if(l1.get(i) != l2.get(i) && k1.get(i) != k2.get(i)){
                System.out.println(false);
            }

        }
        System.out.println(true);


    }
}
