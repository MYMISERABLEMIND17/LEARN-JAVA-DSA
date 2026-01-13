package LECTURE2;

public class question2 {
    public static void main(String[] args) {
        int num = 3  ;

        System.out.println(sum(num));


    }
    static int sum(int n ){
        if ( n == 0  ){
            return 0 ;
        }

        return n + sum(n-1);
    }

}
