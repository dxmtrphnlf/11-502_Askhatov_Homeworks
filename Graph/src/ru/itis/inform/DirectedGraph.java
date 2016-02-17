package ru.itis.inform;

/**
 * Created by Sodium on 17.02.2016.
 */
public interface DirectedGraph {
    void addDirectedVertex();
    void addDirectedEdge(int vertexA, int vertexB, int Weight);
    void showGraph();
    int[][] generateNewGraph();
}
