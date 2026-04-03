package SOLVED;

public class Problem_1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"} ;
        String word = "aaaaabbbbb" ;
        logic(patterns , word);
    }
    static void logic(String[] patterns ,String word ){
        int count  = 0  ;
        int i = 0 ;
        while ( i< patterns.length){
            if(word.contains(patterns[i])){
                count++;
            }
            i++ ;
        }
        System.out.println(count);
    }
}
