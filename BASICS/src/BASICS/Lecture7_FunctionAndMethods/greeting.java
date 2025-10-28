package BASICS.Lecture7_FunctionAndMethods;

public class greeting {
    public static void main(String[] args) {
        String greeting = greet();
        System.out.println(greeting);


    }

    static String greet(){
        String greeting = "hi , good morning" ;
        return greeting ;
    }
}
