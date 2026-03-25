package UNSOLVED.leetcode;

public class Problem_680 {
    public static void main(String[] args) {
        String a = "abcbda" ;
        logic(a);
    }
    static void logic (String str ){
        int start  = 0 ;
        int end = str.length()-1;
        int count = 0 ;
        int mid  = start + (end - start)/2 ;
        while (start <= end ){
            if(str.charAt(start) != str.charAt(end)) {
                if(mid - start < end-mid ){
                    end-- ;
                }
                else{
                    start++ ;
                }
                count++ ;
            }
            else {
                start++ ;
                end-- ;
            }
        }
        if(count <= 1 ){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
