import java.util.HashSet;

public class RemoveDupsLL {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>(); // created linked list

        for(int i = 1; i <= 8; i++) {
            list.insertAtHead(i);      // inserting data in list
        }
        //inserting duplicates
        list.insertAtHead(2);
        list.insertAtHead(4);
        list.insertAtHead(1);

        System.out.println("List before deleting duplicates from list :");
        list.printList();
        removeDuplicatesWithHashing(list); // calling removeDuplicatesWithHashing function
        System.out.println("List after deleting duplicates from list :");
        list.printList();
    }

    public static <V> void removeDuplicatesWithHashing(SinglyLinkedList<V> list){

        SinglyLinkedList<V>.Node current = list.getHeadNode();
        SinglyLinkedList<V>.Node prevNode = list.getHeadNode();

        HashSet<V> visitedNodes = new HashSet<V>();

        if (!list.isEmpty() && current.nextNode != null) {
            while (current!=null){
                if(visitedNodes.contains(current.data)){
                    prevNode.nextNode = current.nextNode;
                    current = current.nextNode;
                }else {
                    visitedNodes.add(current.data);
                    prevNode = current;
                    current = current.nextNode;
                }
            }
        }

    }
}
