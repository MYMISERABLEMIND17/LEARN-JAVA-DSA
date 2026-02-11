public class ESD {
    public static void main(String[] args) {
//        first();
//        second();
//        third();
        fourth();
    }

    static void first(){
        int nums = 5 ;
        for (int i = 0; i < nums ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void second(){
        int nums = 5  ;
        for (int i = 0; i < nums ; i++) {
            for (int j = 0; j < nums; j++) {
                if(j<i){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
    static void third(){
        int nums = 5 ;
        for (int i = nums; i > 0; i--) {
            for (int j = 0 ; j< i ; j++  ) {
                if( i>= j  ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    static void fourth(){
        int nums = 5 ;
        for (int i = nums+1; i > 0 ; i--) {
            for (int j = nums; j > 0 ; j--) {
                if(j < i){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
