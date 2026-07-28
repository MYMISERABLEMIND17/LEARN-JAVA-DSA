import java.util.Arrays;

public class Problem_2410 {
    public static void main(String[]  args ){
        int[] players = {4,7,9} ;
        int[] trainer = {8,2,5,8} ;
        Arrays.sort(trainer) ;
        Arrays.sort(players) ;
        int match = 0 ;
        int i = 0 ;
        int j = 0 ;
        while(i < trainer.length ){
            if(players[j] <= trainer[i] ){
                match++ ;
                j++ ;
            }

            i++ ;
        }
        System.out.println(match) ;
    }
}
