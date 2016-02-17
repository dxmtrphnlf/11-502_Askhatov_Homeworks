package ru.itis.inform;

import static org.junit.Assert.assertEquals;


/**
 * Created by Sodium on 17.02.2016.
 */
public class DirectedGraphTest {
    // объектная переменная для объекта, который мы будем тестировать
        private DirectedGraph directedGraph;


        // инструкция которая запускается перед тестами
        @org.junit.Before
        public void setUp() throws Exception {
            this.directedGraph = new GraphMatrixImpl();

            this.directedGraph.addDirectedVertex();
            this.directedGraph.addDirectedVertex();
            this.directedGraph.addDirectedVertex();
            this.directedGraph.addDirectedEdge(0,1,3);
            this.directedGraph.addDirectedEdge(1,2,8);
            this.directedGraph.addDirectedEdge(0,2,34);
        }

        // модульный тест - тестирующая функция
        @org.junit.Test
        public void testGraph() throws Exception {
            // то, что получили фактически при тестировании
            int[][] directedActual = directedGraph.generateNewGraph();

            // матрица для неориентированного графа

            // матрица для ориентированного графа
            int[][] directedMatrix = new int[50][50];
            directedMatrix[0][1]=3;
            directedMatrix[0][2]=11;
            directedMatrix[1][2]=8;


            // сравниваем то, что получили, с тем, что ожидаем получить
            assertEquals(directedMatrix, directedActual);
        }
        @org.junit.Test(expected = IllegalArgumentException.class)
        public void testOnNegative() throws Exception {
            directedGraph.addDirectedEdge(20, 1, 4);
        }

}
