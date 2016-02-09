package February.February8;

/**
 * Created by Sodium on 08.02.2016.
 */

public class Main {

    public static void main(String[] args) {
        Graph graph = new GraphMatrixImpl();

        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();

        graph.addEdge(0, 2, 10);
        graph.addEdge(0, 3, 3);
        graph.addEdge(3, 4, 4);
        graph.addEdge(2, 1, 5);
        graph.addEdge(2, 4, 2);
        graph.addEdge(4, 1, 3);
        graph.addEdge(4, 1, 6);
        graph.addEdge(6, 3, 4);


        graph.showGraph();
    }
}