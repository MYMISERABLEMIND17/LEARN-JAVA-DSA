package LINKEDLIST;

public class INITIALIZE {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static class LL {
        Node head = null ;

        void first(int data){
            Node newnode = new Node(data) ;
            newnode.next = head ;
            head = newnode ;
        }
    }

    public static void main(String[] args) {
        LL x = new LL();  // NOW THIS WORKS PERFECTLY
        System.out.println("Linked list initialized!");
    }
}

