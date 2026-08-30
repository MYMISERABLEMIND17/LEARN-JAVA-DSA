public class Problem_647 {
    public static void main() {
        String str = "abacaba" ;
        int start = 0 ;
        int end  = 0  ;
        if(str.length() % 2 == 0 ){
            int mid  = str.length() / 2 ;
            start = mid ;
            end = mid + 1 ;
        }
        else {
            start = str.length() /2 -1  ;
            end = str.length() /2  + 1  ;
        }
        int count = 0 ;
        while(start >= 0 && end <= str.length()-1 ){

        }

    }
}
