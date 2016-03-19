import java.security.PrivateKey;
import java.util.InputMismatchException;
import java.util.LinkedList;

import org.junit.*;

public class JarvisMetodTest {
    private Points[] pointsArray;
    private Points[] actual;
    private Points[] expected;
    private int k=0;
    @org.junit.Before
    public void setUp() throws Exception {
        this.pointsArray = new Points[12];
        this.pointsArray[0] = new Points(3, 4);
        this.pointsArray[1] = new Points(4, 1);
        this.pointsArray[2] = new Points(6, 2);
        this.pointsArray[3] = new Points(7, 5);
        this.pointsArray[4] = new Points(2, 6);
        this.pointsArray[5] = new Points(5, 2);
        this.pointsArray[6] = new Points(3, 4);
        this.pointsArray[7] = new Points(0, 6);
        this.pointsArray[8] = new Points(4, 2);
        this.pointsArray[9] = new Points(8, 8);
        this.pointsArray[10] = new Points(2, 1);
        this.pointsArray[11] = new Points(3, 5);
    }
    @org.junit.Test
    public void testJarvis() throws Exception {
        JarvisMetod actuals = new JarvisMetod();
        actual = new Points[100];
        actual = actuals.findContur(pointsArray);
        expected = new Points[100];
        expected[0] = new Points(2, 1);
        expected[1] = new Points(4, 1);
        expected[2] = new Points(6, 2);
        expected[3] = new Points(7, 5);
        expected[4] = new Points(8, 8);
        expected[5] = new Points(0, 6);
        while (expected[k] != null || actual[k] != null) {
            Assert.assertEquals(expected[k].getX(), actual[k].getX());
            Assert.assertEquals(expected[k].getY(), actual[k].getY());
            k++;
        }
    }
}