package LECTURE2.staticdeep;

public class greett {
    int age ;
    String nameee ;
    public greett( String nameee  , int age){
        this.nameee =  nameee;
        this.age = age ;
//        System.out.println("this is my name " + nameee);
    }
    

    // we know that something non static belongs to an object
    void greet(){
        System.out.println("hello world ");
    }
}

