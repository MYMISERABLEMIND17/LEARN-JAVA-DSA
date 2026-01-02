package UNSOLVED;

public class Problem_1903 {
    public static void main(String[] args) {
        String num = new String("35427") ;

        System.out.println(logic(num));
    }
    static String logic (String num){
        char max = '0';
        String num1 = num.replaceAll("0+$" , "") ;
        int number = Integer.parseInt(num1) ;

        for (int i = 0; i <= num.length()-1 ; i++) {

            char counter = num.charAt(i);
            int intvalue = Character.getNumericValue(counter) ;

            if(counter > max &&  intvalue % 2 == 1 ){
                max = counter ;
            }
        }
        if(max == '0' ){
            return "" ;
        } else if (number % 2 == 1) {
            return num ;
        }
        String result = Character.toString(max) ;
        return result ;

    }
}
