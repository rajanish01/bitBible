package main.graph;

/**
 * @author Rajanish Ranjan
 * @date 6-Nov-2020
 */
public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        // Adding edges one by one
        graph.addEdgeUnDirected(0, 1);
        graph.addEdgeUnDirected(0, 4);
        graph.addEdgeUnDirected(1, 2);
        graph.addEdgeUnDirected(1, 3);
        graph.addEdgeUnDirected(1, 4);
        graph.addEdgeUnDirected(2, 3);
        graph.addEdgeUnDirected(3, 4);

        graph.printAdjacencyMatrix();
        graph.printAdjacencyList();

    }
}
