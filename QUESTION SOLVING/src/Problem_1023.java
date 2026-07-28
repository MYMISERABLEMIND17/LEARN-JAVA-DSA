import java.util.Arrays;

import static java.lang.Character.isUpperCase;

public class Problem_1023 {
    public static void main(String[] args ){
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"} ;
        String pattern = "FB" ;
        logic(queries , pattern) ;
    }
    static void logic(String[] q , String p ) {
        boolean[] bool = new boolean[q.length] ;
        StringBuilder patt = new StringBuilder(p) ;
        int i = 0 ;
        StringBuilder emp = new StringBuilder() ;
        while(i < bool.length ){

            int j = 0 ;
            while(j < q[i].length()) {
                System.out.println(q[i].charAt(j));
                if( isUpperCase(q[i].charAt(j))){
                    emp.append(q[i].charAt(j)) ;
                }
                j++ ;
            }
            if (p.equals(emp.toString())) {
                bool[i] = true;
            }
//            emp.delete(0 , emp.length()-1) ;
            i++ ;
            emp.setLength(0);
        }
        System.out.println(Arrays.toString(bool)) ;

    }
}
