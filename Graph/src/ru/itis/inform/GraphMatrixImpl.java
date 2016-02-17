package ru.itis.inform;

public class GraphMatrixImpl implements DirectedGraph, Graph {
    private static final int DEFAULT_SIZE = 50;
    /**
     * Тут храним вершины и ребра
     */
    private int matrix[][];


    /**
     * Сколько вершин сейчас в графе. Вершины нумеруются от 0.
     */
    private int verticesCount;
    private int directionValue;

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
        if (vertexA < this.verticesCount && vertexB < this.verticesCount) {
            this.directionValue++;
            this.matrix[vertexA][vertexB] = weight;
            this.matrix[vertexB][vertexA] = weight;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void showGraph() {
        for (int i = 0; i < verticesCount; i++) {
            for (int j = 0; j < verticesCount - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(matrix[i][verticesCount - 1]);
        }
    }

    public int[][] generateNewGraph() {
        int newMatrix[][] = new int[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < DEFAULT_SIZE; i++)
            for (int j = 0; j < DEFAULT_SIZE; j++)
                for (int k = 0; k < DEFAULT_SIZE; k++)
                    if (newMatrix[i][j] > matrix[i][k] + matrix[k][j] && matrix[i][k] != 0 && matrix[k][j] != 0)
                        newMatrix[i][j] = matrix[i][k] + matrix[k][j];
        return newMatrix;
    }

    @Override
    public void addDirectedVertex() {
        addVertex();
    }

    @Override
    public void addDirectedEdge(int vertexA, int vertexB, int weight) {
        if (vertexA < this.verticesCount && vertexB < this.verticesCount) {
            this.directionValue++;
            this.matrix[vertexA][vertexB] = weight;
        } else throw new IllegalArgumentException();
    }
}