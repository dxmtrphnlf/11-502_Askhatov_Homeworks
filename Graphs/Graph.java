package February.February8;

/**
 * Created by Sodium on 09.02.2016.
 */
public interface Graph {

    /**
     * Добавление вершины в граф
     */
    void addVertex();

    /**
     * Добавление ребра
     * @param vertexA первая вершина
     * @param vertexB вторая вершина
     */
    void addEdge(int vertexA, int vertexB, int weight);

    /**
     * Вывод графа на экран
     */
    void showGraph();
}
