package SOLVED;

public class Problem_414 {

    public static void main(String[] args) {

        int[] nums = {1,2,2,5,3,5};

        int first = 0;
        int second = 0;
        int third = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (counter == 0) {
                first = nums[i];
                counter++;

            } else if (counter == 1 ) {
                if(first == nums[i]){
                    continue ;
                }
                if (nums[i] > first) {
                    second = first;
                    first = nums[i];
                } else {
                    second = nums[i];
                }
                counter++;

            } else if (counter == 2 ) {
                if (nums[i] == first || nums[i] == second ){
                    continue ;
                }
                if (nums[i] > first) {
                    third = second;
                    second = first;
                    first = nums[i];
                }
                else if (nums[i] > second) {
                    third = second;
                    second = nums[i];
                } else {
                    third = nums[i];
                }
                counter++;

            } else if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];

            } else if (nums[i] != first && nums[i] > second) {
                third = second;
                second = nums[i];

            } else if (nums[i] != first && nums[i] != second  &&nums[i] > third) {
                third = nums[i];
            }
            System.out.println(first +","+ second +","+ third);
        }

        int result;
        if (counter == 3) {
            result = third;
        } else {
            result = first;
        }

        System.out.println(result);
    }
}
