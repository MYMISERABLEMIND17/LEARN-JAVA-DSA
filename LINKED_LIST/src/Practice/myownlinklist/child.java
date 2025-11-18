package Practice.myownlinklist;

public class child {

    static class Node{
        int data ;
        Node next  ;
    }

    static class link{
        Node head ;
        Node tail ;
        int size ;

        link(){
            this.size = 0 ;
        }
        public void first(int val ){
            Node node = new Node();
            node.data = val ;

            node.next = head ;
            head = node ;

            if( tail == null ){
                tail = head ;
            }
            size++ ;
        }

        public void display(){
            Node temp = head ;

            while(temp !=null ){
                System.out.println(temp.data);

                temp =temp.next ;
            }
        }
    }





}