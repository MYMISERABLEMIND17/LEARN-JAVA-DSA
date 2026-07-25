package SOLVED.leetcode;

public class Problem_476 {
    public static void  main(String[] args ){
        int num = 5 ;
        if(num == 0 ){
            System.out.println(1) ;
        }

        int mask = 0 ;
        int temp = num ;


        while(temp != 0 ){
            mask =  (mask << 1 ) | 1 ;
            temp = temp >> 1 ;
        }

        System.out.println(temp) ;
    }
}
