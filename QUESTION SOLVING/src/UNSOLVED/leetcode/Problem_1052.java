public class Problem_1052 {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5} ;
        int[] grumpy = {0,1,0,1,0,1,0,1} ;
        int minutes = 3 ;
        logic(customers , grumpy , minutes);
    }
    static void logic(int[] c, int[] g,  int m){
        // steps / my logic
        // create a window = minutes
        // find initial satisfaction
        int is = 0 ;
        for (int i = 0; i < c.length; i++) {
            if(g[i] == 0 ){
                is = is + c[i] ;
            }
        }
        System.out.println(is);

        // now create a window of length minutes i.e 3
        int start = 0 ;
        int end = m-1  ;
        int sum = 0  ;
        for (int i = 0; i <= end; i++) {
            sum = sum + c[i] ;
        }

        System.out.println(sum);




    }
}
