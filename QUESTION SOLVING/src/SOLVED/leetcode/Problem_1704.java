package SOLVED.leetcode;

public class Problem_1704 {
    public static void main(String[] args) {
        String s = "book" ;
        logic(s);
    }
    static boolean logic(String str ){
        str.toLowerCase() ;
        StringBuilder word = new StringBuilder(str) ;

        str = str.toLowerCase();

        int start = 0;
        int last = str.length();
        int mid  = start + (last - start) / 2;

        String first = str.substring(start, mid);
        String second = str.substring(mid, last);

        StringBuilder firsthalf = new StringBuilder(first);
        StringBuilder secondhalf = new StringBuilder(second);

        int countone = 0;
        int counttwo = 0;

        int i = 0;
        while (i < firsthalf.length()) {
            char c = firsthalf.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countone++;
            }
            i++;
        }

        int j = 0;
        while (j < secondhalf.length()) {
            char c = secondhalf.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counttwo++;
            }
            j++;
        }

        return countone == counttwo;
    }
}
