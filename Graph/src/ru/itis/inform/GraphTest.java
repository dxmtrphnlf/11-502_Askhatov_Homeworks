package ru.itis.inform;

import org.junit.Assert;

import static org.junit.Assert.*;

public class GraphTest {

    // объектная переменная для объекта, который мы будем тестировать
    private Graph graph;
    // инструкция которая запускается перед тестами
    @org.junit.Before
    public void setUp() throws Exception {
        this.graph = new GraphMatrixImpl();

        this.graph.addVertex();
        this.graph.addVertex();
        this.graph.addVertex();
        this.graph.addVertex();

        this.graph.addEdge(0,1,5);
        this.graph.addEdge(1,2,3);
        this.graph.addEdge(2,3,4);
        this.graph.addEdge(0,3,8);
        this.graph.addEdge(0,2,2);
    }

    // модульный тест - тестирующая функция
    @org.junit.Test
    public void testGraph() throws Exception {
        // то, что получили фактически при тестировании
        int[][] actual = graph.runFloyd();
        // матрица для неориентированного графа
        int[][] matrix = new int[50][50];
        matrix[0][1]=5;
        matrix[0][2]=2;
        matrix[0][3]=6;
        matrix[1][0]=5;
        matrix[1][2]=3;
        matrix[2][0]=2;
        matrix[2][1]=3;
        matrix[2][3]=4;
        matrix[3][0]=6;
        matrix[3][2]=4;

        // сравниваем то, что получили, с тем, что ожидаем получить
        Assert.assertArrayEquals(matrix, actual);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testOnNegative() throws Exception {
        graph.addEdge(20, 1, 4);
    }

}