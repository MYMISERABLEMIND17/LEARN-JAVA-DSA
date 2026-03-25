public class Problem_1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G" ;
        logic(command);
    }
    static void logic(String str ){
        StringBuilder  x = new StringBuilder() ;
        int i = 0 ;
        while( i < str.length()){
            if(str.charAt(i) == '(' && str.charAt(i+1) == ')'){
                x.append('o') ;
            } else if (str.charAt(i) == '(' && str.charAt(i+1) == 'a' ) {
                x.append("al") ;
            }
            else if(str.charAt(i) == 'G'){
                x.append('G') ;
            }

            i++ ;
        }
        System.out.println(x);
    }
}
