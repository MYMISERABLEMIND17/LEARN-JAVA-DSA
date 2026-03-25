import java.util.Arrays;

public class Problem_1859 {
    public static void main(String[] args) {
        String s  = "Myself2 Me1 I4 and3" ;
        logic(s);
    }
    static  void logic (String str ){
        StringBuilder x = new StringBuilder(str.length()) ;
        x.insert( 0 , " hello ");
        x.insert(1 , "world ") ;

        System.out.println(x);
    }
}
