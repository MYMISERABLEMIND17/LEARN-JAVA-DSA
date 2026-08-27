package UNSOLVED.leetcode;

public class Problem_826 {
    public static void main(String[] args ){

        int[] diff= {2,4,6,8,10} ;
        int[] prof = {10,20,30,40,50} ;
        int[] worker = {4,5,6,7} ;

        int profitt = 0  ;
        int i = 0 ;

        while(i < worker.length) {
            int close = Integer.MAX_VALUE;
            int currentpointer = 0;

            int j = 0;
            while (j < diff.length) {
                if ((worker[i] - diff[j]) < close) {
                    if (worker[i] - diff[j] == 0) {
                        profitt = profitt + prof[j];
                        break;
                    }

                    close = worker[i] - diff[j];
                    currentpointer = j;
                }

                j++;

            }
            profitt = profitt + prof[currentpointer] ;
            i++;
        }
        System.out.println(profitt) ;

    }
}