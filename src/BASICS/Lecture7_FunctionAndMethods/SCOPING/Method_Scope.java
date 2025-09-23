package BASICS.Lecture7_FunctionAndMethods.SCOPING;

public class Method_Scope {
    public static void main(String[] args) {
        int a = 10000 ;
        System.out.println(a);
        random() ;
    }

    static void random() {
        int a = 10 ;
        int b = 30 ;
        int sum = a +b ;
        System.out.println( sum );

        // int "a" variable is seperate for this method , and seperate for main method also . bcoz int a in random() method is method scope ;

     };

}
