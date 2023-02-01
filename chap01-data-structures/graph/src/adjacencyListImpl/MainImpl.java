package adjacencyListImpl;

public class MainImpl {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 5);

        g.printGraph();

    }
}
