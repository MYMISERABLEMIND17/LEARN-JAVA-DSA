public class Problem_58 {
    public static void main(String[] args) {
        String s =  "   fly me   to   the moon   " ;
        logic(s);
    }
    static void logic(String str){
        str = str.trim() ;
        int i = 0 ;
        int count = 0 ;

        while( i< str.length()){
            if( str.charAt(i) == ' '){
                count = 0 ;
            }
            else{
                count++ ;
            }

            i++ ;
        }
        System.out.println(count);
    }
}
