package Practice1;

import java.util.LinkedList;

public class linkedlist_practice1 {
    
    // crate a linkedList

    public static void main(String[] args) {
        
       
       LinkedList ll =  createListList();
       reverseLinkedList(ll);
        
    }

    public static LinkedList<Integer> createListList(){

        LinkedList<Integer> llist = new LinkedList<>();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);

        return llist;

    }

    public static void reverseLinkedList(LinkedList<Integer> ll){

        LinkedList<Integer> reversell = new LinkedList<Integer>();
        for(int i=ll.size()-1;i>=0;i--){
            reversell.add(ll.get(i));
        }
       System.out.println(reversell);
    }
}
