public class Problem_461 {
    public static void main(String[] args ){
        int xdd = 13 ;
        int ydd = 4 ;
        logic(xdd ,ydd ) ;
    }
    static void logic(int x , int y ){
        int a  = x ^ y ;
        System.out.print(a) ;
        int count = 0  ;
        int distance = 0 ;

        while(a != 0 ){
            if((a & 1) == 1 ){
                count++ ;
            }


            a = a >>> 1 ;
        }
    }
}
