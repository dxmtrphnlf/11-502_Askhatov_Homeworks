package ru.itis.inform;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;
public class FarreyLinkedListImplTest {
    private FarreyLinkedListImpl farreyArray;
    @org.junit.Before
    public void setUp() throws Exception {
        this.farreyArray = new FarreyLinkedListImpl();
    }
    @org.junit.Test
    public void testFarreyLinkedList() throws Exception {
        LinkedList<RationalNumber> actuals = new LinkedList<>();
        actuals=this.farreyArray.generate(8);

        LinkedList<RationalNumber> rationalNumber = new LinkedList<>();
        rationalNumber.add(new RationalNumber(1, 1));
        rationalNumber.add(new RationalNumber(7, 8));
        rationalNumber.add(new RationalNumber(6, 7));
        rationalNumber.add(new RationalNumber(5, 6));
        rationalNumber.add(new RationalNumber(4, 5));
        rationalNumber.add(new RationalNumber(3, 4));
        rationalNumber.add(new RationalNumber(5, 7));
        rationalNumber.add(new RationalNumber(2, 3));
        rationalNumber.add(new RationalNumber(5, 8));
        rationalNumber.add(new RationalNumber(3, 5));
        rationalNumber.add(new RationalNumber(4, 7));
        rationalNumber.add(new RationalNumber(1, 2));
        rationalNumber.add(new RationalNumber(3, 7));
        rationalNumber.add(new RationalNumber(2, 5));
        rationalNumber.add(new RationalNumber(3, 8));
        rationalNumber.add(new RationalNumber(1, 3));
        rationalNumber.add(new RationalNumber(2, 7));
        rationalNumber.add(new RationalNumber(1, 4));
        rationalNumber.add(new RationalNumber(1, 5));
        rationalNumber.add(new RationalNumber(1, 6));
        rationalNumber.add(new RationalNumber(1, 7));
        rationalNumber.add(new RationalNumber(1, 8));
        rationalNumber.add(new RationalNumber(0, 1));
        Iterator<RationalNumber> rationalNumberIterator = rationalNumber.iterator();
        Iterator<RationalNumber> actualsIterator = actuals.iterator();
//        for (int i=0; i<24;i++)
//            System.out.println(rationalNumberIterator.next().getA() + "  ||  "+actualsIterator.next().getA());

        Assert.assertEquals(rationalNumberIterator.next().getA(), actualsIterator.next().getA());
        Assert.assertEquals(rationalNumberIterator.next().getB(), actualsIterator.next().getB());
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testOnNegative() throws Exception {
        RationalNumber d = new RationalNumber(3, 0);
    }
}