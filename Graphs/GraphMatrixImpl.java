package February.February8;

/**
 * Created by Sodium on 09.02.2016.
 */
public class GraphMatrixImpl implements Graph {

    private static final int DEFAULT_SIZE = 50;
    /**
     * Тут храним вершины и ребра
     */
    private int matrix[][];

    /**
     * Сколько вершин сейчас в графе. Вершины нумеруются от 0.
     */
    private int verticesCount;

    private int maxSize;

    public GraphMatrixImpl() {
        initGraph(DEFAULT_SIZE);
    }

    public GraphMatrixImpl(int maxSize) {
        initGraph(maxSize);
    }

    private void initGraph(int maxSize) {
        this.maxSize = maxSize;
        this.verticesCount = 0;
        this.matrix = new int[maxSize][maxSize];
    }

    @Override
    public void addVertex() {
        if (this.verticesCount < this.maxSize) {
            this.verticesCount++;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addEdge(int vertexA, int vertexB, int weight) {
        //вес вроде не может быть отрицательным(проверка)
        if (weight>0) {
            if (vertexA < verticesCount && vertexB < verticesCount) {
                // поскольку граф направленный, то this.matrix[vertexB][vertexA] = weight не нужен
                this.matrix[vertexA][vertexB] = weight;
            } else throw new IllegalArgumentException();
        }   else throw new IllegalArgumentException();
}

    @Override

    public void showGraph() {
        for (int i = 0; i < verticesCount; i++) {
            for (int j = 0; j < verticesCount - 1; j++) {
                System.out.print(matrix[i][j] + ",  ");
            }
            System.out.println(matrix[i][verticesCount - 1]);
        }
    }
}