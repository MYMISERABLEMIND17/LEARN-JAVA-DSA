public class Problem_1768 {
    public static void main(String[] args) {

        String  word1 = "abcd" ;
        String  word2 = "pq"  ;
        logic(word1 , word2);
    }
    static void logic (String w1 , String w2 ){
        StringBuilder x = new StringBuilder() ;

        int i = 0 ;
        while(i < w1.length() || i <w2.length() ){
            if(i < w1.length() ){
                x.append(w1.charAt(i)) ;
            }
            if(i < w2.length() ){
                x.append(w2.charAt(i)) ;
            }
            i++ ;
        }



        String result = x.toString() ;
        System.out.println(result);
    }
}
