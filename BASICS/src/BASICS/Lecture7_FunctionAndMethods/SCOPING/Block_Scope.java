package BASICS.Lecture7_FunctionAndMethods.SCOPING;

public class Block_Scope {
    public static void main(String[] args) {
        int a = 100 ;
        int b  = 30 ;
        {       int z = 200 ;
            {
                a = 9 ; // we do not declare the variable ,instead we just change the value  , original onr is changed
                int c = 20; // block scoped,we cannnot access the value of c outside the block
                System.out.println(c);
            }
            System.out.println(z);
        }

        int c = 30 ;
//        System.out.println(z );// this will not workbcoz we are calling it outside the block
        System.out.println(a  ); // this sout onnnly work for the the variable which are outside the blockscope

    }
}
