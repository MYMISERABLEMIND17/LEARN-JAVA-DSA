package UNSOLVED;

import java.util.ArrayList;
    import java.util.List;

    public class Problem_1408 {
        public static void main(String[] args) {
            String[] words = {"leetcode","et","code"} ;
            logic(words);
        }
        static void logic (String[] str){
            List<String> list = new ArrayList<>();
            int i = 0 ;
            int j = 0  ;
            while( i < str.length){
                while (j < str.length){
                    if(i == j ){
                        j++ ;
                        continue;
                    }
                    else if(str[j].contains(str[i]) ){
                      list.add(str[i]) ;
                      break ;
                    }

                    j++ ;
                }
                j=0 ;
                i++;
            }
            System.out.println(list);
        }
    }
