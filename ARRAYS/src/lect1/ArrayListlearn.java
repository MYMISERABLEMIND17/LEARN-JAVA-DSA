package lect1;

import java.util.ArrayList;

public class ArrayListlearn {
    public static void main(String[] args) {
        // syntax = ArrayListlearn<Integer> name = new ArrayListlearn<>() ;


        ArrayList<Integer> list = new ArrayList<>(10) ;
        list.add(100) ;
        list.add(100) ;
        list.add(100) ;
        list.add(50) ;
        list.add(100) ;
        list.add(100) ;
        list.add(100) ;
        list.add(100) ;
        list.add(100) ;
        list.add(100) ;
        list.add(10000) ;

        System.out.println(list);


//        updation
        list.set(3 ,55) ;
        System.out.println(list);

























    }
}
