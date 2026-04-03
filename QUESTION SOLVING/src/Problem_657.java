public class Problem_657 {
    public static void main(String[] args) {
        String moves = "LL" ;
        logic(moves);
    }
    static boolean logic(String str){
        int count = 0 ;
        int x = 0  ;
        int y = 0  ;
        int i = 0 ;
        while (i < str.length()){

            if(str.charAt(i) == 'R' ){
                x++ ;
            }
            if(str.charAt(i) == 'L' ){
                x-- ;
            }
            if(str.charAt(i) == 'U' ){
                y++ ;
            }
            if(str.charAt(i) == 'D' ){
                y++ ;
            }

            i++ ;
        }
        if(x == 0 && y == 0 ){
            return true  ;
        }
        return false ;
    }
}
