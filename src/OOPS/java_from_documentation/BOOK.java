package OOPS.java_from_documentation;

public class BOOK {
    public static void main(String[] args) {
        Info firstBook = new Info() ;
        firstBook.Name = "maths 1" ;
        firstBook.Price = 600 ;
        firstBook.type = "Acadmics" ;

        System.out.println(firstBook.Name);
        System.out.println(firstBook.Price);
        System.out.println(firstBook.type);
    }




    }


class Info{
    String Name ;
    int Price ;
    String type ;
}