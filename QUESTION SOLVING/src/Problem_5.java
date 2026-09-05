//public class Problem_5 {
//    public static void main(String[] args) {
//        String str = "bbaaaa" ;
//
//        String str = "bbaaaa";
//
//        int start = 0;
//        int end = 0;
//        int count = 0;
//        int i = 0;
//
//        while (i < str.length()){
//
//            int j = i;
//            int k = i;
//
//            while (j >= 0 && k < str.length()) {
//
//                if (str.charAt(j) != str.charAt(k)) {
//                    break;
//                }
//
//                int c = k - j + 1;
//
//                if (c > count) {
//                    start = j;
//                    end = k;
//                    count = c;
//                }
//
//                j--;
//                k++;
//            }
//
//
//
//
//            j = i;
//            k = i + 1;
//
//            while (j >= 0 && k < str.length()) {
//
//                if (str.charAt(j) != str.charAt(k)) {
//                    break;
//                }
//
//                int c = k - j + 1;
//
//                if (c > count) {
//                    start = j;
//                    end = k;
//                    count = c;
//                }
//
//                j--;
//                k++;
//            }
//
//            i++;
//        }
//
//        System.out.println("Start: " + start);
//        System.out.println("End: " + end);
//        System.out.println("Length: " + count);
//
//        System.out.println("Answer: " + str.substring(start, end + 1));
//    }
//}
