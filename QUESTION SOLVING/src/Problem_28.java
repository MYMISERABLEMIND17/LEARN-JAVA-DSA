public class Problem_28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad" ;
        String needle = "sad" ;

        System.out.println(logic(haystack , needle));
    }
    static int logic(String h , String n){
        int i = 0 ;
        int j = 0  ;
        while (i < h.length()){
            if(h.charAt(i) == n.charAt(j) ){

                if(j == n.length()-1){
                    return i-j;
                }
                j++ ;
            }
            else{
                j = 0 ;
            }
            i++ ;
        }
        return -1 ;
    }
}
