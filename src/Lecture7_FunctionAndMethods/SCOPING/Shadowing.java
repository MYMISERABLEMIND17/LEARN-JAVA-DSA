package Lecture7_FunctionAndMethods.SCOPING;

public class Shadowing {
    static int x =  9 ;
    public static void main(String[] args) {
        System.out.println(x );
        int x = 100 ;// now the value of the x will changed ; , this overshadows the value
        System.out.println(x); // this will print x = 100

    }
}
