package SOLVED.leetcode;

public class Problem_2379 {
    public static void main(String[] args ){
        String blocks = "WBWBBBW";
        int k = 2 ;
        logic(blocks , k ) ;
    }
    static void logic(String b , int k ){
        int left  = 0 ;
        int right = k ;
        int minwhite = Integer.MAX_VALUE ;
        int white = 0 ;
        for(int i = left  ; i < right ; i++ ){
            System.out.println(b.charAt(i)) ;
            if(b.charAt(i) == 'W'){
                white ++ ;
            }
        }
        minwhite = white ;

        while(right < b.length()){

            if(b.charAt(left) == 'W'){
                white-- ;
            }
            if(b.charAt(right) == 'W'){
                white++ ;
            }
            if(white  < minwhite ){
                minwhite = white ;
            }
            left++ ;
            right++ ;
        }

        System.out.println(minwhite) ;

    }
}
