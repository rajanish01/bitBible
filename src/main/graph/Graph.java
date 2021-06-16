package main.graph;

import java.util.ArrayList;

/**
 * @author Rajanish Ranjan
 * @date 6-Nov-2020
 */
public class Graph {

    private final int vertices;

    private final int[][] adjacencyMatrix;

    private final ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public int getVertices() {
        return vertices;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public ArrayList<ArrayList<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix : \n");
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < this.vertices; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void printAdjacencyList() {
        System.out.println("\nAdjacency List : ");
        for (int i = 0; i < this.vertices; i++) {
            System.out.println("\nAdjacency list of vertex : " + i);
            System.out.print("head");
            for (int j = 0; j < this.adjacencyList.get(i).size(); j++) {
                System.out.print(" -> " + this.adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void addEdgeUnDirected(int startNode, int endNode) {
        this.adjacencyList.get(startNode).add(endNode);
        this.adjacencyList.get(endNode).add(startNode);

        this.adjacencyMatrix[startNode][endNode] = 1;
        this.adjacencyMatrix[endNode][startNode] = 1;
    }

    public void addEdgeDirected(int startNode, int endNode) {
        this.adjacencyList.get(startNode).add(endNode);

        this.adjacencyMatrix[startNode][endNode] = 1;
    }
}
