package OOPS.OOPS_LECTURE1;

public class Basics {
    public static void main(String[] args) {
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
//        Student[] students = new Student[5];

//        Student kunal;
//        kunal = new Student() ;





        Student random = new Student(33, " home " , 43) ;
        System.out.println(random.marks + " "+  random.name);

    }
}



    class Student {
        int rno ;
        String name ;
        float marks ;


        Student ( int rno , String name , float marks ){
            this.marks = marks ;
            this.rno = rno ;
            this.name = name ;
        }


    }



// NEW KEYWORD =>dynamically allocates memory and returns a reference to it
//CLASS => IS A LOGICAL CONSTRUCT
// OBJECT IS A REAL THINGS WHICH ARE REALLY EXISTED.
//.(DOT OPERATOR ) OR A SEPERATOR ,THIS HELP TO FIND THE VALUE OF THE OBJECT

// CONSTRUCTOR =>