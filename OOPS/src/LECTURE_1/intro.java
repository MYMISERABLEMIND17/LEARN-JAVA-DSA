package LECTURE_1;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
//        Student[] student = new Student[5];
//        System.out.println(Arrays.toString(student));

        Student kunal = new Student(22,"this is the 2 argument one  ");
        System.out.println(kunal.rno);
        System.out.println(kunal.x);

        Student om  = new Student(33," this is the  argument one" , 55) ;
        System.out.println(om.marks);
        System.out.println(om.rno);
        System.out.println(om.x);

//        this will call the null constructor , call this( default values)
        Student sam = new Student() ;
        System.out.println(sam.marks);
        System.out.println(sam.rno);
        System.out.println(sam.x);

    }
}
    class Student {
        int rno ;
        String x ;
        float marks ;

        Student(int rno ,String x ){
            this.rno = rno ;
            this.x = x ;
        }

//         this will call the null constructor , call this( default values)
        Student (){
            this(000 , "default" , 00.0f);
        }

        Student(int rno ,String x , float marks){
            this.rno = rno ;
            this.x = x ;
            this.marks = marks ;
        }
    }


