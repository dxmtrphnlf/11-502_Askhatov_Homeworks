public interface DirectedGraph {
    void addDirectedVertex();
    void addDirectedEdge(int vertexA, int vertexB, int Weight);
    void showGraph();
    int[][] runFloyd();
}
