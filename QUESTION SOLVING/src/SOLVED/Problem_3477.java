package SOLVED;

public class Problem_3477 {
    static void main(String[] args) {
        int[] fruits = {4,2,5} ;
        int[]  baskets = {3,5,4} ;
        int unplaced = 0 ;
        int placed = 0 ;
        for(int i  = 0 ; i < fruits.length ; i++  ){
            int fruit = fruits[i] ;

            for(int j = 0 ; j < baskets.length ; j++){
                int basket = baskets[j] ;
                if(basket >= fruit  ){
                    baskets[j] = -1 ;
                    placed++ ;
                    break ;
                }

            }
        }
        System.out.println(fruits.length - placed);

    }
}
