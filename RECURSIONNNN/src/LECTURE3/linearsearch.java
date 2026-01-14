package LECTURE3;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,0,3,5,0} ;
        int target  = 0 ;
        int i = 0 ;
        search(arr , target , i ) ;
    }
    static  boolean search(int[] arr ,int target , int i  ){
        if( i == arr.length ){
            return false ;
        }
        if(arr[i] == target){
            System.out.println(i);
            return true ;
        }
        else{
            return arr[i] == target || search(arr , target , i+1) ;
            }


    }
}
