public class Problem_680 {
    public static void main (String[] args ){
        String a = "abccbca" ;
        StringBuilder sb = new StringBuilder(a) ;
        int i = 0 ;
        int j = sb.length()-1 ;
        while(i <= j ){
            if(sb.charAt(i) == sb.charAt(j)){
                i++ ;
                j-- ;
            }
            else if(sb.charAt(i) != sb.charAt(j)){
                // check 1
                int left = i ;
                int right = j-1 ;

                while(left <=  right ){
                    if(sb.charAt(left) == sb.charAt(right)){
                        left++ ;
                        right-- ;
                    }else{
                        break ;
                    }
                }
                int l = i+1 ;
                int r = j ;
                while(l <= r){
                    if(sb.charAt(l) == sb.charAt(r)){
                        l++ ;
                        r-- ;
                    }else{
                        break ;
                    }
                }
                boolean removeRight = left >= right;
                boolean removeLeft = l >= r;

                System.out.println(removeRight || removeLeft);
                return;

            }

        }
    }
}
