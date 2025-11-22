package SINGLY_LINKEDLIST;

import com.sun.security.jgss.GSSUtil;

import java.security.PrivateKey;
public class LL {

    private class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
        }

    }

    private Node head ;
    private Node tail ;
    private  int size ;

    public LL (){
        this.size = 0 ;
    }

    public void InsertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head ;
        head = node ;

        if( tail == null ){
            tail = head ;
        }
        size++ ;
    }


        public void display(){
            Node temp = head ;
            while(temp!= null){
                System.out.println(temp.data);
                temp = temp.next ;
            }
        }
//

}
