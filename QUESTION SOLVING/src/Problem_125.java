public class Problem_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama" ;
        logic(s) ;
    }
    static boolean logic (String str){
        str = str.toLowerCase() ;
        int start = 0  ;
        int end  = str.length()-1;
        while(start <= end ){

            if(!Character.isLetterOrDigit(str.charAt(start))){
                start++ ;
                continue;
            }
            if(!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
                continue;
            }
            else if(str.charAt(start) != str.charAt(end)){
                return false ;
            }
            else{
                start++ ;
                end--;
            }
        }
        return true ;

    }
}
