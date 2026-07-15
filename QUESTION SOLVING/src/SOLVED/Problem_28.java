package SOLVED;

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

    public static class Problem_680 {
        public static void main (String[] args ){
            String a = "abccbca" ;
            StringBuilder sb = new StringBuilder(a) ;
            int i = 0 ;
            int j = sb.length()-1 ;
            while(i <= j ){
                if(sb.charAt(i) == sb.charAt(j)){
                    i++ ;
                    j-- ;
                }
                else if(sb.charAt(i) != sb.charAt(j)){
                    // check 1
                    int left = i ;
                    int right = j-1 ;

                    while(left <=  right ){
                        if(sb.charAt(left) == sb.charAt(right)){
                            left++ ;
                            right-- ;
                        }else{
                            break ;
                        }
                    }
                    int l = i+1 ;
                    int r = j ;
                    while(l <= r){
                        if(sb.charAt(l) == sb.charAt(r)){
                            l++ ;
                            r-- ;
                        }else{
                            break ;
                        }
                    }
                    boolean removeRight = left >= right;
                    boolean removeLeft = l >= r;

                    System.out.println(removeRight || removeLeft);
                    return;

                }

            }
        }
    }
}
