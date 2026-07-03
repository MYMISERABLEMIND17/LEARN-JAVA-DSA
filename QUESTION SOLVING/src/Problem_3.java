public class Problem_3 {
    public static void main(String[] args) {
        String x = "pwwkew" ;
        logic(x);
    }
    static void logic(String string ) {
        StringBuilder str = new StringBuilder(string);
        int i = 0 ;
        int j = str.length()-1 ;
        int finalmin = 1 ;
        while(i < str.length()){
            int min = Integer.MAX_VALUE;
            while(j > i ){
                if(str.charAt(i) == str.charAt(j) && j-i < min)
                    min = j - i ;
                j-- ;
            }
            j = str.length()-1 ;
            if(min > finalmin){
                finalmin = min ;
            }
            i++ ;
        }
        System.out.println(finalmin);

    }
}
