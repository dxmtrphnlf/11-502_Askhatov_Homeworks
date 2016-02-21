package ru.itis.inform;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class FarreyArrayImplTest {
    private FarreyArrayImpl farreyArray;

    @org.junit.Before
    public void setUp() throws Exception {
        this.farreyArray = new FarreyArrayImpl();
    }
    @org.junit.Test
    public void testFarrey() throws Exception {
        RationalNumber[] actual = new RationalNumber[64];
        actual= this.farreyArray.runFloyd(8);

        RationalNumber[] rationalNumber = new RationalNumber[64];
        for(int i=0;i<64;i++) {
            rationalNumber[i]= null;
        }
        rationalNumber[0] = new RationalNumber(0, 1);
        rationalNumber[1] = new RationalNumber(1,8);
        rationalNumber[2] = new RationalNumber(1,7);
        rationalNumber[3] = new RationalNumber(1,6);
        rationalNumber[4] = new RationalNumber(1,5);
        rationalNumber[5] = new RationalNumber(1,4);
        rationalNumber[6] = new RationalNumber(2,7);
        rationalNumber[7] = new RationalNumber(1,3);
        rationalNumber[8] = new RationalNumber(3,8);
        rationalNumber[9] = new RationalNumber(2,5);
        rationalNumber[10] = new RationalNumber(3,7);
        rationalNumber[11] = new RationalNumber(1,2);
        rationalNumber[12] = new RationalNumber(4,7);
        rationalNumber[13] = new RationalNumber(3,5);
        rationalNumber[14] = new RationalNumber(5,8);
        rationalNumber[15] = new RationalNumber(2,3);
        rationalNumber[16] = new RationalNumber(5,7);
        rationalNumber[17] = new RationalNumber(3,4);
        rationalNumber[18] = new RationalNumber(4,5);
        rationalNumber[19] = new RationalNumber(5,6);
        rationalNumber[20] = new RationalNumber(6,7);
        rationalNumber[21] = new RationalNumber(7,8);
        rationalNumber[22] = new RationalNumber(1,1);
        int[] newActualA = new int[64];
        int[] expectedA = new int[64];
        int[] expectedB = new int[64];
        int[] newActualB = new int[64];
        for(int i=0;i<23;i++) {
            newActualA[i]=(actual[i].getA());
            expectedA[i]=(rationalNumber[i].getA());
            newActualB[i]=(actual[i].getB());
            expectedB[i]=(rationalNumber[i].getB());
        }
        for(int i=0;i<23;i++) {
           System.out.print(newActualA[i]+" ");
           System.out.print(expectedA[i]+" || ");
           System.out.print(newActualB[i]+" ");
           System.out.println(expectedB[i]);

        }
        Assert.assertArrayEquals(newActualA, expectedA);
        Assert.assertArrayEquals(newActualB, expectedB);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testOnNegative() throws Exception {
        RationalNumber d = new RationalNumber(3, 0);
    }
}
