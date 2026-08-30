import java.util.ArrayList;

public class Problem_443 {
    public static void main(String[] args) {
        char[] ch = {'a' , 'a' , 'a' , 'a' , 'b' , 'b' , 'b' , 'c' ,'d'} ;
        ArrayList x = new ArrayList<>() ;
        System.out.println(x);

        int i = 0 ;
        int j = 0 ;
        int count  = 0 ;
        while (i < ch.length && j < ch.length){
            if(ch[i] == ch[j]){
                if(i == ch.length-1 && j == i ){
                    x.add(ch[j]) ;

                }
                count++ ;
                i++ ;


            }
            else if (ch[j] !=ch[i]) {
                x.add(ch[j]) ;

                if(count > 1  ){

                    ch[j+1] = (char) count ;
                }

                j = i ;
                count = 0 ;
            }
        }

        System.out.println(x);
        System.out.println(x.size());

    }
}
