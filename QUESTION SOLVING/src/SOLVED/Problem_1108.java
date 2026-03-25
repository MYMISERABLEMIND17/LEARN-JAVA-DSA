package SOLVED;

public class Problem_1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1" ;
        logic(address);
    }
    static void logic (String str ){
        StringBuilder strbui  = new StringBuilder() ;;
        int i = 0 ;
        while (i< str.length()) {
            if( str.charAt(i) == ('.')){
                System.out.println("find");
                strbui.append('[') ;
                strbui.append('.') ;
                strbui.append(']') ;
            }
            else{
                strbui.append(str.charAt(i)) ;
            }
            i++ ;
        }
        System.out.println(strbui);
        String result = strbui.toString() ;
    }
}
