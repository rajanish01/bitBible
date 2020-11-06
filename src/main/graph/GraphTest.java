package main.graph;

/**
 * @author Rajanish Ranjan
 * @date 6-Nov-2020
 */
public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        // Adding edges one by one
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();

    }
}
