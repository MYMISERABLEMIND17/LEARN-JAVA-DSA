public class Problem_1456 {
    public static void main(String[] args  ){
        String s = "abciiidef" ;
        int a = 3 ;

        logic(s , a) ;
    }
    static void logic(String str ,int  k){
        int maxcount = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < k ; i++ ){
            System.out.println(str.charAt(i)) ;
            if(str.charAt(i) == 'a' || str.charAt(i) =='e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'||  str.charAt(i) =='u'){
                count++ ;
            }
        }
        maxcount = count ;
        int left = 0  ;
        int right = k-1 ;

        while(right < str.length()-1){
            right = k+ left  ;
            if(str.charAt(left) == 'a' || str.charAt(left) =='e' || str.charAt(left) == 'i'|| str.charAt(left) == 'o'||  str.charAt(left) =='u' && count > 0 ){
                count-- ;
            }
            if(str.charAt(right) == 'a' || str.charAt(right) =='e' || str.charAt(right) == 'i'|| str.charAt(right) == 'o'||  str.charAt(right) =='u'){
                count++ ;
            }
            if(maxcount < count ){
                maxcount = count ;
            }

            left++ ;
        }
        System.out.println(maxcount) ;
    }
}
