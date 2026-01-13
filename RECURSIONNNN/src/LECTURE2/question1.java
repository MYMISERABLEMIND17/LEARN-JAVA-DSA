package LECTURE2;

public class question1 {
    public static void main(String[] args) {
        int n = 5  ;

        System.out.print(logic(n));
    }
    static int logic( int n){
        if(n == 0 ){
            return 1 ;
        }
//        logic(n-1);
//        System.out.println(n);
        return n * logic(n-1);
    }
}
