import java.util.Arrays;

public class Problem_2491 {
    public static void main(String[] args){
        int[] skill = {3,4} ;
        Arrays.sort(skill) ;
        int i =  0 ;
        int j  = skill.length-1 ;
        int currsum = skill[i] + skill[j] ;
        long total = 0 ;
        while(i < j ){
            if((skill[i] + skill[j]) == currsum){
                total = ( total + (skill[i] * skill[j])) ;

            }
            else{
                System.out.println("-1") ;
            }
            i++ ;
            j-- ;
        }

        System.out.println(total) ;
    }
}