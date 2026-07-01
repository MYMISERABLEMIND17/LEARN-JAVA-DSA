public class Problem_463 {
    public static void main(String[] args) {
        int[][] nums = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}} ;
        logic(nums);
    }
    static void logic(int[][] grid){
        int sum = 0 ;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    sum = sum +4 ;
                        if(j>0 && grid[i][j-1] ==1){
                            sum = sum -2 ;
                        }
                        if( i > 0  && grid[i-1][j] == 1 ){
                            sum = sum -2 ;
                        }

                }
            }
        }
        System.out.println(sum);
    }
}
