package SOLVED.leetcode;

public class Problem_2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"} ;
        logic(details);
    }
    static void logic (String[] details){
        int i = 0 ;
        int count  = 0 ;
        while(i < details.length){
            String age = details[i].substring(11, 13) ;
            int x = Integer.parseInt(age);
            if(x >60 ){
                count++ ;
            }
            i++ ;
        }
        System.out.println(count);
    }
}
