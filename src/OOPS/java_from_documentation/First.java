package OOPS.java_from_documentation;


public class First {

    public static void main(String[] args) {
        Human Manan = new Human();
        Manan.name = "Manan" ;
        Manan.skinColor = "dark" ;
        Manan.phoneModel = " iphone 16 pro max";
        Manan.languge = "bhau bhau" ;

        System.out.println(Manan.name +" is a "+ Manan.skinColor + " man " );
        System.out.println( "he  has  : "+ Manan.phoneModel);
        System.out.println("Manan's language is " + Manan.languge);

    }
}

class Human{
    String name  ;
    String skinColor ;
    String phoneModel ;
    String languge ;
    }


