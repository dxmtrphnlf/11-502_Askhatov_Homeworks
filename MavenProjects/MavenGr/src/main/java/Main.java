public class Main {

    public static void main(String[] args) {
        Graph graph = new GraphMatrixImpl();


        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addEdge(0,1,5);
        graph.addEdge(1,2,3);
        graph.addEdge(2,3,4);
        graph.addEdge(0,3,8);
        graph.addEdge(0,2,2);


        DirectedGraph directedGraph = new GraphMatrixImpl();


        directedGraph.addDirectedVertex();
        directedGraph.addDirectedVertex();
        directedGraph.addDirectedVertex();
        directedGraph.addDirectedEdge(0,1,3);
        directedGraph.addDirectedEdge(1,2,8);
        directedGraph.addDirectedEdge(0,2,34);



        graph.showGraph();
        System.out.println();
        int[][] a = graph.runFloyd();
        for (int i = 0; i<=3; i++) {
            for (int j = 0; j<=3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        directedGraph.showGraph();
        System.out.println();
        int b[][] = directedGraph.runFloyd();
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
