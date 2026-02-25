package Weekly_contest490;

public class problem_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int player1 = 0;
        int player2 = 0;

        int active = 0; // 0 = player1, 1 = player2

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] % 2 != 0) {
                active ^= 1;
            }


            if ((i + 1) % 6 == 0) {
                active ^= 1;
            }


            if (active == 0) {
                player1 += nums[i];
            } else {
                player2 += nums[i];
            }
        }

        return player1 - player2;




    }
}
