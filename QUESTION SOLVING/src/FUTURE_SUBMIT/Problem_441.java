package FUTURE_SUBMIT;

public class Problem_441 {
    public static void main(String[] args) {
        int k= 8 ;
        logic(k);
    }
    static void logic(int n ){
        int count = 0 ;
        int i = 1 ;
        while(n>=i){
            n = n - i ;
            count++ ;
            i++;
        }
        System.out.println(count);
    }
}
