package SOLVED;

public class Problem_2108 {
    public static void main(String[]  args){
        String[] s = {"abc","car","ada","racecar","cool"} ;
//        logic(s) ;
        System.out.println(logic(s)) ;
    }
    static String logic(String[] str ){
        for(int i =0 ; i < str.length ; i++ ){
//            System.out.println(str[i].charAt(0)) ;

            int a = 0 ;
            int b = str[i].length()-1 ;
            while(a<=b){
                if(str[i].charAt(a) == str[i].charAt(b)){
                    if(a == b || b-a == 1 ){
                        return str[i] ;
                    }
                    a++ ;
                    b-- ;
                }
                else{
                    break ;
                }

            }

        }
        return "" ;
    }
}
