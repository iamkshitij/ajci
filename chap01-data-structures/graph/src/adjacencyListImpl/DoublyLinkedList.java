package adjacencyListImpl;

public class DoublyLinkedList<T> {

    public class Node{
        public T data;
        public Node prevNode;
        public Node nextNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedList(){
        this.headNode = null;
        this.tailNode = null;
    }

    boolean isEmpty(){
        if(headNode == null && tailNode == null)
            return true;
        return false;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    // null <- [data] -> <- [headNode]
    //        [headNode]

    public void insertAtHead(T data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode;
        newNode.prevNode = null;

        if (headNode != null)
            headNode.prevNode = newNode;
        else
            tailNode = newNode;
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data){

        if(isEmpty()){
            insertAtHead(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.prevNode = tailNode;

        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = headNode;

        while (currentNode.nextNode != null){
            System.out.print(currentNode.data+ " <-> ");
            currentNode = currentNode.nextNode;
        }

        System.out.println(currentNode.data+ " -> null");
    }

    public void reversePrintList(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = tailNode;

        while (currentNode.prevNode != null){
            System.out.print(currentNode.data.toString() + " <-> ");
            currentNode = currentNode.prevNode;
        }

        System.out.println(currentNode.data.toString()+" -> null");
    }

    public void deleteAtHead(){
        if (isEmpty()) return;

        headNode = headNode.nextNode;

        if(headNode == null)
            tailNode = null;
        else
            headNode.prevNode = null;
        size--;
    }

    public void deleteAtTail(){
        if (isEmpty()) return;

        tailNode = tailNode.prevNode;
        if(tailNode == null)
            headNode = null;
        else
            tailNode.nextNode = null;
        size--;

    }

}
