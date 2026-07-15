public class Problem_28 {
    public static void  main(String[] args){
        String haystack = "sadbutsad" ;
        String needle = "sad" ;
        int i = 0 ;
        int j = 0 ;
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == needle.length()-1 ){
                    System.out.println(i) ;
                }
                i++ ;
                j++ ;
            }
            else{
                i = i - j + 1 ;
                j = 0 ;
            }
        }
        System.out.println(-1) ;
    }
}
