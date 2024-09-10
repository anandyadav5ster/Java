import java.util.*;


class Node{
    int data ;
    Node next;

    Node(int data){
        this.data = data;
        
    }
}

public class LinkedList{

    Node head;

    public void reverse(){

        Node prev= null;
        Node current = head;
        Node next = null;

        while (current!=null) {
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create_linklist();
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original LinkedListis ");
       list.printlist();

       list.reverse();
        System.out.println("After reverse : ");
        list.printlist();

      
    }

    

   

    
}
