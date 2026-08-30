package SOLVED;

import java.util.Arrays;

public class Problem_443 {
    public static void main(String[] args) {
        char[] ch = {'a' , 'a' , 'b' , 'b' , 'c' , 'c' , 'c' } ;

        int i = 0 ;
        int j = 0 ;
        int flip  = 0 ;
        int count = 0 ;
        while (j < ch.length){
            if (j == ch.length-1) {

                if(ch[i] == ch[j]){
                    count++;
                    ch[flip] = ch[i] ;
                    flip++ ;
                    if (count > 1) {
                        for (char c : String.valueOf(count).toCharArray()) {
                            ch[flip] = c;
                            flip++;
                        }
                    }
                }
                else{
                    ch[flip] = ch[i] ;
                    flip++ ;
                    if (count > 1) {
                        for (char c : String.valueOf(count).toCharArray()) {
                            ch[flip] = c;
                            flip++;
                        }
                    }
                    ch[flip] = ch[j] ;
                    flip++ ;

                }
                count = 0 ;
                break ;
            }

            else if(ch[i] == ch[j] ){
                count++ ;
                j++ ;
            }

            else if(ch[i] != ch[j] ){
                ch[flip] = ch[i] ;
                flip++ ;
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        ch[flip] = c;
                        flip++;
                    }
                }
                count = 0 ;
                i = j ;
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}
