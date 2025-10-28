package lect1.multidimensionalArray;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int["number of rows "]["number of columns"]
        int[][] array= new int[3][3] ;
        int[][] array2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(array2d[1][2]); // this will give me 6


    }
}
