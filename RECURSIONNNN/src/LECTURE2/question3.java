package LECTURE2;

public class question3 {
    public static void main(String[] args) {
        int n = 34 ;


        System.out.println(logic(n));
    }
    static int   logic( int x ){
        if(x%10 == x ){
            return  x ;
        }
        return  x%10 * logic((x/10) );
    }
}
//






