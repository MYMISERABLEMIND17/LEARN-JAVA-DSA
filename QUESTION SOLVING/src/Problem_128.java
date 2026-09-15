import java.util.HashMap;

public class Problem_128 {
    public static void main(String[] args) {
        String s = "aaba" ;
        int start = 0 ;
        int end = s.length()-1 ;
        int scount = s.length() ;

        for (int i = 0; i < s.length(); i++) {
            int left = i-1 ;
            int right = i+1 ;
            while(left >= 0 && right <s.length() ){
                if(s.charAt(left) == s.charAt(right)){
                    scount++ ;
                }
                else{
                    break;
                }
                left-- ;
                right++ ;
            }
            int l = i ;
            int r = i + 1 ;
            while(l >= 0 && r <s.length() ){
                if(s.charAt(l) == s.charAt(r)){
                    scount++ ;
                }
                else{
                    break;
                }
                l-- ;
                r++ ;
            }



        }
        System.out.println(scount);

    }
}
