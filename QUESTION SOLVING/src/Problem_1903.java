public class Problem_1903 {
    public static void main(String[] args) {
        String s = "4206" ;

        System.out.println(logic(s));
    }
    static String logic(String str ){
        int i  = str.length()-1 ;
        while(i >= 0){

            int digit = str.charAt(i) -  '0' ;
            if( digit % 2 != 0  ){
                return str.substring(0 , i+1) ;
            }

            i-- ;
        }

        return "" ;
    }
}
