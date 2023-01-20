public class SingleLinkedList<T> {
    class Node{
        T data;
        Node nextNode;
    }
    int size;
    Node headNode;

    SingleLinkedList(){
        size = 0;
        headNode = null;
    }

    public boolean isEmpty(){
        if(headNode == null) return true;
        return false;
    }

    public void insertAtHead(T data){
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data){
        //if the list is empty then call insertATHead()
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        //Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node last = headNode;
        //iterate to the last element
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        //make newNode the next element of the last node
        last.nextNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public void insertAfter(T data, T prev){

        //Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        //Start from head node
        Node currentNode = this.headNode;
        //traverse the list until node having data equal to previous is found
        while (currentNode != null && !currentNode.data.equals(prev))
            currentNode = currentNode.nextNode;

        //if such a node was found
        //then point our newNode to currentNode's nextElement
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }
    }

    public void searchNode(T data){

        if(isEmpty()){
            System.out.println("Empty linked list");
            return;
        }

        Node currentNode = this.headNode;

        while (currentNode != null){
            if(currentNode.data.equals(data)){
                System.out.println("Node found");
                return;
            }
            currentNode = currentNode.nextNode;
        }
        System.out.println("node not found!");
    }

    public void deleteAtHead(){
        if(isEmpty())
            return;

        headNode = headNode.nextNode;
        size--;
    }

    public void deleteByValue(T data){
        // if list is empty then return
        if (isEmpty())
            return;

        // start from head node
        Node currentNode = this.headNode;
        Node prevNode = null;

        // if node is at head
        if(currentNode.data.equals(data)){
            deleteAtHead();
            return;
        }

        // traverse till node is found
        while (currentNode!=null){
           if(data.equals(currentNode.data)){
               prevNode.nextNode = currentNode.nextNode;
               return;
           }
           prevNode = currentNode;
           currentNode = currentNode.nextNode;
        }

    }
}
