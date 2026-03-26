package SOLVED.leetcode;

public class Problem_1662 {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"} ;
        String[] word2 = {"abcddefg"} ;


        System.out.println(logic(word1 , word2));
    }
    static boolean logic (String[] word1, String[] word2){
        StringBuilder w1 = new StringBuilder() ;
        StringBuilder w2 = new StringBuilder() ;
        int i = 0 ;
        while ( i< word1.length ){
            w1.append(word1[i]) ;
//            System.out.println(w1);
//            System.out.println(w2);
            i++ ;
        }
        int j = 0 ;
        while(j < word2.length){
            w2.append(word2[j]) ;
            j++ ;
        }

        String w1str = w1.toString() ;
        String w2str = w2.toString() ;


        if(w1str.equals(w2str)){
            return true ;
        }
        return false ;
    }
}
