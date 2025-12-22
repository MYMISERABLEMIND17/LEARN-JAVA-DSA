import java.util.Arrays;

public class Problem_66_UNSOLVED {
    public static void main(String[] args) {
        int[] arr = {9} ;
        System.out.println(plusone(arr));
    }
    static int[] plusone(int[] digits){
        if(digits[digits.length-1]<9){
            digits[digits.length-1] = digits[digits.length-1] + 1 ;
        }
        else if(digits.length == 1 && digits[0] == 9){
            return new int[] {1,0};
        }
        else if(digits[digits.length-1] == 9){
            digits[0] = digits[0]+1 ;
            digits[digits.length-1] = 0 ;
        }
        System.out.println(Arrays.toString(digits));
        return digits ;
    }
}
