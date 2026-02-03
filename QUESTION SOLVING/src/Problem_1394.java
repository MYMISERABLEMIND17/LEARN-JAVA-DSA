import java.util.ArrayList;

public class Problem_1394 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3} , {4,5,6} , {7,8,9}} ;
        logic(nums);
    }
    static void logic( int[][] arr ){
        ArrayList<Integer> finallist = new ArrayList<>() ;
        ArrayList<Integer> rowMins = new ArrayList<>();
        ArrayList<Integer> colMaxs = new ArrayList<>();

        for (int i = 0 ; i< arr.length ;i++){
            int maxy = arr[0][i] ;
            int minx = arr[i][0] ;

            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[j][i] > maxy){
                    maxy = arr[j][i] ;
                }
            }
            colMaxs.add(maxy) ;


            for (int k = 0; k < arr.length ; k++) {
                if(arr[i][k] < minx){
                    minx = arr[i][k] ;
                }
            }
            rowMins.add(minx) ;
        }

        for (int p = 0; p < rowMins.size(); p++) {
            for (int j = 0;  j < colMaxs.size()  ; j++) {
                if(rowMins.get(p) == colMaxs.get(j) ){
                    finallist.add(rowMins.get(p)) ;
                }
            }
        }
        System.out.print(finallist);
    }
}
