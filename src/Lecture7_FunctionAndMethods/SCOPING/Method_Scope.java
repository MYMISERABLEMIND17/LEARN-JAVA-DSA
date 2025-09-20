package Lecture7_FunctionAndMethods.SCOPING;

public class Method_Scope {
    public static void main(String[] args) {
        random() ;
    }

    static void random() {
        int a = 10 ;
        int b = 30 ;
        int sum = a +b ;
        System.out.println( sum );
    };

}
