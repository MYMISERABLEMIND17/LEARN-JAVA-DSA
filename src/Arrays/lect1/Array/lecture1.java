package Arrays.lect1.Array;

public class lecture1 {
    public static void main(String[] args) {
        // so we want to store the roll  no
        int s  = 44 ;

        // store the name
        String name  = "soham";

        // now we want to store 5 names and there roll no

        //syntax of arrays
        // datatype[] variable_name = new datatype[size] ;
        int[] rollno = new int[5] ;
        // new int[5] => at the runtime the memory will be allocated
        // int[] rollno => this thing allocates the memory at the compile time
            // new => it is used to create a object

        int[] rno = { 33 ,44, 22 ,55 ,54,32} ; // this this is direct declaration

        // Array = arrays object are created in heap and
        // heap objects are not continuous in java
        // in java it is not necessary of continuous array
        int n = 0 ;
        while(n<=5){
            System.out.println(rno[n]); // just playing with the things
            n++ ;
        }

//--------------------------------------------------------------------------------------------------------------------------------------
// only primitiver are stored in the stack memory , rest of all will be stored in the hea momory
        // what the data type becomes String
        String[] strarr = new String[9] ;
        strarr[2] = "hello " ;
//        System.out.println(strarr[2]); // this gives hello
//        System.out.println(strarr[0]); // this will gives us the null
//        lets run  loop
        int i = 0 ;
        while(i<=8){
            System.out.println(strarr[i]);
            i++ ;
        }
        //  NOW THE MAIN POINT COMES , ACTUALLY String[] strarr = new String[9] ; THIS LINE WILL CREATE 9 NEW OBJECTS THATS WHY IT IS GIVING US NULL , BCOZ IT IS A OBJECT WHICH IS DECLARED


    }
}
