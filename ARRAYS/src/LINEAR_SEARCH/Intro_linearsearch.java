package LINEAR_SEARCH;

import java.util.Scanner;

public class Intro_linearsearch {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt() ;
        int[] data = {2,3,4,56,7} ;
        search(data , target);
    }



    public static void search(int[] data, int target) {
        for(int i = 0  ;i<=data.length-1 ; i++){
            if(target == i ){
                System.out.println("value found =" + target);
            }
        }
    }


}
