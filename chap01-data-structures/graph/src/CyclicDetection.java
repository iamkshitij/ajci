import adjacencyListImpl.DoublyLinkedList;
import adjacencyListImpl.Graph;

public class CyclicDetection {

    public static void main(String[] args) {
        Graph g1 = new Graph(4);
        g1.addEdge(0,1);
        g1.addEdge(1,2);
        g1.addEdge(1,3);
        g1.addEdge(3,0);
        g1.printGraph();
        System.out.println(detectCycle(g1));

        System.out.println();
        Graph g2 = new Graph(3);
        g2.addEdge(0,1);
        g2.addEdge(1,2);
        g2.printGraph();
        System.out.println(detectCycle(g2));

    }


    public static boolean detectCycle(Graph g){
        int numOfVertices = g.vertices;

        boolean[] visited = new boolean[numOfVertices];
        boolean[] stackFlag = new boolean[numOfVertices];


        for (int i = 0; i < numOfVertices; i++) {
            if(cyclic(i,g,visited,stackFlag)){
                return true;
            }
        }
        return false;
    }

    public static boolean cyclic(int v, Graph g, boolean[] visited, boolean[] stackFlag){

        if(stackFlag[v]) return true;

        if (visited[v]) return false;

        visited[v] = true;
        stackFlag[v] = true;

        DoublyLinkedList<Integer>.Node temp = null;

        if(g.adjacencyList[v] !=null){
            temp = g.adjacencyList[v].getHeadNode();

            while (temp !=null){
                if(cyclic(temp.data,g ,visited,stackFlag))
                    return true;
            temp = temp.nextNode;
            }
            stackFlag[v] = false;
        }

        return  false;
    }



}
