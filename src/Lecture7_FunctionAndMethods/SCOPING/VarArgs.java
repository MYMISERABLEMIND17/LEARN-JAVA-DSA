package Lecture7_FunctionAndMethods.SCOPING;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(9 , 10 , " pst ", "xyc" ,"ybc ", " jdbg", "jb") ;
    }
    static void fun(int a , int b ,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
