//public class Problem_680 {
//    public static void main(String[] args) {
//        String  s = "abca" ;
//
//        System.out.println(logic(s));
//    }
//    static boolean logic (String str ){
//        int i = 0 ;
//        int j = str.length()-1 ;
//        int del = 0 ;
//        while(i < j ){
//            if(str.charAt(i) == str.charAt(j)){
//                i++ ;
//                j-- ;
//            }
//            else if(str.charAt(i) != str.charAt(j) ) {
//                if (str.charAt(i) == str.charAt(j - 1)) {
//                    j-- ;
//                    del++;
//                } else if (str.charAt(i + 1) == str.charAt(j)) {
//                    i++;
//                    del++;
//                }
//                return false;
//            }
//        }
//        return true ;
//    }
//}
