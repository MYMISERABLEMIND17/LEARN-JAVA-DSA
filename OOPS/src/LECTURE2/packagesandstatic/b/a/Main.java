package LECTURE2.packagesandstatic.b.a;

public class Main {


    public static void main(String[] args) {
        human naman = new human("naman" , 10 , "green" , "black") ;
        human alex = new human("alex" , 44  , " brown " , "grey" ) ;
        human x = new human("x" , 55 , "green" , " black") ;
//        human.population ;
        System.out.println(human.population);
        System.out.println(naman.population);
        System.out.println(alex.population);
        System.out.println(x.population);
    }
}
