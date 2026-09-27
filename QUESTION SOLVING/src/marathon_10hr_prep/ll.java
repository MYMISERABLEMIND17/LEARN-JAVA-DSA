package marathon_10hr_prep;

import java.util.List;

public class ll {
    static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};

        LL head = new LL(nums[0]) ;

        LL current = head ;

        for (int i = 1; i < nums.length; i++) {
            current.next = new LL(nums[i]) ;
            current = current.next ;

        }


        System.out.println(len(head));
        System.out.println(search(head , 7));

        System.out.println(middle(head));
    }
    static int len(LL head){
        int count = 0 ;
        LL curr = head ;
        while (curr != null){
            curr = curr.next ;
            count++ ;
        }
        return count ;
    }

    static boolean search(LL head, int target) {
        LL curr = head ;
        while (curr != null ){
            if(curr.value == target){
                return true ;
            }
            curr = curr.next ;
        }
        return false ;
    }

    static int middle( LL head ){
        int size = 1 ;
        LL current  = head ;
        while(current.next != null ){
            size++ ;
            current = current.next ;
        }

        if(size % 2 != 0 ){
            int ind = size/2  ;
            int count = 0 ;
            LL curr = head ;
            while (count <= size ){

                curr = curr.next ;
                count++ ;

                if(count == ind){
                    return curr.value;
                }

            }
        }
        else {
            int ind = size/2  ;
            int count = 0 ;
            LL curr = head ;
            while (count <= size ){

                curr = curr.next ;
                count++ ;

                if(count == ind){
                    return curr.value;
                }

            }
        }
        return -1 ;
    }
}
class LL{
    int value ;
    LL prev ;
    LL next  ;
    LL(int value){
        prev = null;
        this.value = value ;
        next = null ;
    }
}

