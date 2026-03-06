package LECTURE2.packagesandstatic.b.a;

public class human {
    String name ;
    int age ;
    String color ;
    String haircolor ;
    static int population ;



    // this is the constructor ;
    public human(String name  , int age , String  color , String haircolor ){
         this.name = name  ;
         this.age = age ;
         this .color = color ;
         this.haircolor = haircolor ;
         this.population += 1 ;
    }

}



