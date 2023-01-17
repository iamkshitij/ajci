public class AdjacencyMatrix {

    int vertices;
    int[][] matrix;

    public static void main(String[] args) {
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(4);

        adjacencyMatrix.addEdges(0,1);
        adjacencyMatrix.addEdges(0,2);
        adjacencyMatrix.addEdges(1,3);
        adjacencyMatrix.addEdges(1,2);

        adjacencyMatrix.print();

        System.out.println("After deleting 1 and 3");
        adjacencyMatrix.deleteEdges(1,3);
        adjacencyMatrix.print();
    }

    AdjacencyMatrix(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdges(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void deleteEdges(int source, int destination){
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }


    void print(){
        System.out.println("Representation of Graph in the form of Adjacency Matrix: ");

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public void printMatrix(){

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < vertices; i++) {
            System.out.println("vertices connected:"+i+" ");
            for (int j = 0; j < vertices; j++) {
                if(matrix[i][j] == 1){
                    System.out.println(j+"");
                }
            }
            System.out.println();
        }
    }


}
