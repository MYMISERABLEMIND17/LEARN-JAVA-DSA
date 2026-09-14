public class Problem_2134 {
    static void main(String[] args) {
        int[] nums = {1,1,0,0,1}  ;
        int start = 0 ;
        int st = 0 ;
        int end  = 0 ;
        int ones  = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(start ==  0  && nums[i] == 1 ){
                start++ ;
                st = i ;
            }
            if(nums[i] == 1 ){
                end  = i ;
                ones++ ;
            }
        }
        System.out.println(st);
        System.out.println(end);
        System.out.println(ones);

        int win  = end - st +1 ;
        System.out.println(win);

        System.out.println(win - ones);


        int s1 = 0 ;
        int e1 = 0 ;
        int s2 = 0 ;
        int e2 = nums.length-1 ;
        int fones = 0  ;
        int sones = 0 ;
        int mid  = nums.length / 2 ;
        for (int i = 0; i < nums.length / 2; i++) {
            if(nums[i] == 1 ){
                e1 = i ;
                fones++  ;
            }
        }

        int fwindow  = e1 - s1+1  ;
        System.out.println(fwindow - fones);
        boolean tell =  false ;
        for (int i = mid; i < nums.length; i++) {
            if(nums[i] == 1 ){
                if(tell == false){
                    s2 = i ;
                    tell = true ;
                }
                sones++  ;
            }
        }

        int secwindow = e2 - s2+1 ;
        System.out.println(secwindow - sones);



        int total = (secwindow - sones) +  (fwindow - fones) ;
        System.out.println(total);


        Math.min(total , win - ones) ;
    }

}
