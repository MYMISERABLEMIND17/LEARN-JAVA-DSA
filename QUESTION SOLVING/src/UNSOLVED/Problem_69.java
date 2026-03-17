package UNSOLVED;

public class Problem_69 {
    public static void main(String[] args) {
        int x = 1 ;

        System.out.println(logic(x) );
    }
    static int  logic (int x ){
        int start  = 0;
        int end  = x  ;
        int mid  = start + (end - start)/2 ;
        while(start <= end ){
            mid  = start + (end - start)/2 ;
            if(mid*mid == x ){
                return mid ;
            }
            if(mid*mid < x ){
                start = mid+1 ;
            }
            else {
                end  = mid -1 ;

            }
        }
        return mid ;

    }
}
