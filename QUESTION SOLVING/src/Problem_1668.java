public class Problem_1668 {
    public static void main(String[] args) {
        String sequence = "aaaba" +
                "aaaba" +
                "aaba" +
                "aaaba" +
                "aaaba" +
                "aaaba" +
                "aaaba" ;
        String  word = "aaaba" ;
        logic(sequence , word );
    }
    static void logic(String sequence, String word){
//        int count = 0 ;
//        for (int k = 0; k < sequence.length(); k++) {
//            for (int l = k; l < sequence.length(); l++) {
//                String s = (sequence.substring(k , l +1));
//                if(word.equals(s)){
//                    k = l+1 ;
//                    count++ ;
//                }
//            }
//        }

        int count = 0 ;
        int i = 0 ;
        int j = 0 ;
        while(i < sequence.length()){
            String s = (sequence.substring(j , i+1)) ;
            if(word.equals(s)){
                    j = i+1 ;
                    count++ ;
                }
            else if ( j < sequence.length() && i == sequence.length()-1) {
                j++ ;
                i = j ;
            }
            i++ ;
        }
        System.out.println(count);

    }
}
