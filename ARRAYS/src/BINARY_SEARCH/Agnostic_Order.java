package BINARY_SEARCH;

import java.util.Scanner;

public class Agnostic_Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("whats the target = ");
        int target = input.nextInt();

        int[] arr = {100 , 90 ,80,70, 60 ,50,40, 30,20,10 } ;


    }

    public static int   calc(int[] Myarr, int  Mytarget) {
        int first = Myarr[0];
        int last = Myarr[Myarr.length - 1];

        int start = 0;
        int end = Myarr.length - 1;

        int mid = (start + end) / 2;

        if (first > last) {
            while (start <= end) {
                if (Myarr[mid] == Mytarget) {
                    System.out.print("target found = ");
                    return (mid);
                } else if (Mytarget > Myarr[mid]) {
                    end = mid - 1;
                }
                else if (Mytarget < Myarr[mid]) {
                    start = mid + 1;
                }
                else{
                    System.out.println("not found ");
                }
                return -1;
            }

        }
        return 0;
    }


}
