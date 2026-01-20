package UNSOLVED;

public class Problem_1527 {
    public static void main(String[] args) {

        int[][] matrix = {{1,1,1,1} ,{1,1,1,1} ,{1,1,1,1}, {1,1,1,1}   } ;
        logic(matrix) ;
    }
    static void logic(int[][] matrixx){
        int totalsum = 0 ;
        int primarysum = 0 ;
        int secondarysum = 0 ;

        for (int i = 0; i < matrixx.length  ; i++) {
            for(int j = 0 ; j< matrixx[i].length ; j++){
                if(matrixx[i] == matrixx[j]){
                    primarysum = primarysum+ matrixx[i][j] ;
                }
                if(matrixx[i][j] == matrixx[i][matrixx[i].length-1 -i]){
                    secondarysum = secondarysum + matrixx[i][matrixx[i].length-1 -i] ;
                }
            }
        }
        totalsum = primarysum + secondarysum ;
        if((matrixx.length-1)%2 == 0 ){
            totalsum = totalsum - matrixx[(matrixx.length-1)/2][(matrixx.length-1)/2] ;
        }


        System.out.println(totalsum);
    }
}
