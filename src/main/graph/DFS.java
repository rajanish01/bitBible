package main.graph;

/**
 * DFS algorithm is used for :
 * 1. For a weighted graph, DFS traversal of the graph produces the minimum spanning tree and all pair shortest path tree.
 * 2. Detecting cycle in a graph
 */

import java.util.ArrayList;

/**
 * @author Rajanish Ranjan
 * @date 6-Nov-2020
 */
public class DFS {

    public static void dfsUtil(Graph graph, int v, boolean[] visited) {

        ArrayList<ArrayList<Integer>> adj = graph.getAdjacencyList();
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj.get(v)) {
            if (!visited[n]) {
                dfsUtil(graph, n, visited);
            }
        }
    }

    public static void dfs(Graph g, int v) {
        boolean[] visited = new boolean[g.getVertices()];
        dfsUtil(g, v, visited);
    }

    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdgeDirected(0, 1);
        g.addEdgeDirected(0, 2);
        g.addEdgeDirected(1, 2);
        g.addEdgeDirected(2, 0);
        g.addEdgeDirected(2, 3);
        g.addEdgeDirected(3, 3);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");

        dfs(g, 0);
    }

}
