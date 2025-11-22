package Practice.myownlinklist;

public class child {

    static class link{

        class Node {
            int data ;
            Node next ;
        }

        Node head ;
        Node tail ;
        int size  ;

        public void beg(int val){
            Node node = new Node();
            node.data =  val ;
            node.next = head ;
            head = node ;

            if(tail == null){
                tail = head ;
            }

            size++ ;

        }

        public void disp(){
            Node temp =head ;

            while( temp!=null ){
                System.out.println(temp.data);
                temp = temp.next ;
            }

        }

    }
}