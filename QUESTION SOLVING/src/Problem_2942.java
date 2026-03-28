import java.util.ArrayList;

public class Problem_2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code"} ;
        char x = 'e' ;
        logic( words , x) ;
    }
    static void logic(String[] str , char c ){
        ArrayList<Integer> list  = new ArrayList<>() ;
        int i = 0 ;
        while(i < str.length ){

            String temp  = str[i] ;
            int j = 0 ;
            while( j < temp.length()){
                System.out.println(str[i].charAt(j));
                if(str[i].charAt(j) == c){
                    list.add(i) ;
                    break ;
                }
                j++ ;
            }

            i++ ;
        }
        System.out.println(list);
    }
}
