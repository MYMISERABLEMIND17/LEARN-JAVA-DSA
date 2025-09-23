package BASICS.Lecture7_FunctionAndMethods;

public class Overloading {
    public static void main(String[] args) {
        fun(99);
        fun("   parakram");
        // same function but the value that we are passing was dfferent or you can say the datatypes are different `
    }
    static void fun(int x  ){
        System.out.println( " first function " + x );
    }
// 2 functions but with different datatypes

    static void fun(String name ){

        System.out.println("second function" + name);
    }
}
