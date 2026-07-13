package SOLVED.leetcode;

public class Problem_69 {
    public static void main(String[] args){
        int x = 8 ;
        int min = 0 ;
        int max = x ;
        while(max >= min ){
            int mid = min + (max-min)/2 ;
            if(mid*mid == x ){
                System.out.print(x) ;
            }
            else if(mid*mid > x ){
                max = mid -1  ;
            }
            else if(mid*mid < x){
                min = mid+1 ;
            }
            if(max == min ){
                System.out.println(mid) ;
            }
        }
    }
}
