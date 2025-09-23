package BASICS.Lecture7_FunctionAndMethods.SCOPING;

public class Loop_Scope {
    public static void main(String[] args) {

//        {
//            int a = 30;
//            int b = 10;
//            {
//                a = 100; // we are not initializing ,we just change the value
//                System.out.println(a + b);// does not give the errror // anything declare outside can use inside , but anything inside the block scope , we cannot call them outside
////              int  c = 90 ;
//            }
////        System.out.println(c); // gives error}
//        }


        for (int i = 0 ; i<= 80 ; i++ ){
            System.out.println(i); // but this will work
        }
//        System.out.println(i); // this will not work




    }
}