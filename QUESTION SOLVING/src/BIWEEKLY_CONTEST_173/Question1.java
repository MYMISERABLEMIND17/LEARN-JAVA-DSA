package BIWEEKLY_CONTEST_173;

public class Question1 {
    public static void main(String[] args) {
        String s = "hello" ;
        int k = 3 ;

        System.out.println(logic(s ,k ) );
    }
    static String logic(String s, int k) {
        StringBuilder prefix = new StringBuilder(s.substring(0, k));
        prefix.reverse();
        return prefix.toString() + s.substring(k);
    }

}
