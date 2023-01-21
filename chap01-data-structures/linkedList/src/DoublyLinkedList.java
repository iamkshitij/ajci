public class DoublyLinkedList<T> {

    class Node<T>{
        T data;
        Node previousNode;
        Node nextNode;
    }

    Node headNode;
    int size;


    DoublyLinkedList(){
        this.headNode = null;
    }

    public boolean isEmpty(){
        if(headNode == null) return true;
        return false;
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        newNode.previousNode = null;

        if(headNode != null)
            headNode.previousNode = newNode;
        this.headNode = newNode;
        size++;
    }

    public void printList(){
        if (isEmpty()){
            System.out.println("Empty list");
            return;
        }
        Node currentNode = headNode;
        System.out.print("List : null <- ");

        while (currentNode!=null){
            System.out.println(currentNode.data+" <-> ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.data+" --> null");

    }

    public void deleteAtHead(){

        if (isEmpty()) return;

        headNode = headNode.nextNode;
        headNode.previousNode = null;
        size--;

    }

    public void deleteByValue(T data){
        if(isEmpty()) return;

        Node currentNode = this.headNode;

        if (currentNode.data.equals(data)){
            deleteAtHead();
            return;
        }

        while (currentNode!=null){
            if(data.equals(currentNode.data)){
                currentNode.previousNode.nextNode=currentNode.nextNode;

                if(currentNode.nextNode!=null)
                    currentNode.nextNode.previousNode = currentNode.previousNode;
            }
            currentNode = currentNode.nextNode;
        }
    }
}
