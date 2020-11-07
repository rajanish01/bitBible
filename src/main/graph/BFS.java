package main.graph;

/**
 * BFS algorithm is used for :
 * 1. Shortest Path and Minimum Spanning Tree for unweighted graph.
 * 2. Cycle detection in uni directed graph.
 * 3. Find all nodes within one connected component.
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Rajanish Ranjan
 * @date 6-Nov-2020
 */
public class BFS {

    public static void bfs(Graph graph, int v) {

        boolean[] visited = new boolean[graph.getVertices()];
        LinkedList<Integer> queue = new LinkedList<>();

        ArrayList<ArrayList<Integer>> adj = graph.getAdjacencyList();

        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");

            ArrayList<Integer> adjList = adj.get(v);
            for (int n : adjList) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph(4);
        g.addEdgeDirected(0, 1);
        g.addEdgeDirected(0, 2);
        g.addEdgeDirected(1, 2);
        g.addEdgeDirected(2, 0);
        g.addEdgeDirected(2, 3);
        g.addEdgeDirected(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        bfs(g, 2);
    }

}
