public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> sll = new SingleLinkedList<Integer>();
        for (int i = 1; i <= 10; i++)
            sll.insertAtEnd(i);

        sll.printList();
//        sll.insertAfter(20,2);
//        System.out.println("After insertion at position");
//        sll.printList();

        //sll.searchNode(1);
//        sll.deleteAtHead();
//        sll.printList();
        sll.deleteByValue(6);
        sll.printList();
        sll.deleteByValue(1);
        sll.printList();
    }
}