package ru.itis.inform;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sodium on 17.02.2016.
 */
public class FarreyArrayImplTest {
    // объектная переменная для объекта, который мы будем тестировать
    private FarreyArrayImpl farreyArray;


    // инструкция которая запускается перед тестами
    @org.junit.Before
    public void setUp() throws Exception {
        this.farreyArray = new FarreyArrayImpl();
    }

    // модульный тест - тестирующая функция
    @org.junit.Test
    public void testGraph() throws Exception {
        // то, что получили фактически при тестировании
        LinkedList<RationalNumber> actuals = new LinkedList<>();
        actuals=farreyArray.runFloyd(8);

        // матрица для ориентированного графа
        //Тестирование не проходит
        LinkedList<RationalNumber> rationalNumber = new LinkedList<>();
        rationalNumber.add(new RationalNumber(0, 1));
        rationalNumber.add(new RationalNumber(1, 8));
        rationalNumber.add(new RationalNumber(1, 7));
        rationalNumber.add(new RationalNumber(1, 6));
        rationalNumber.add(new RationalNumber(1, 5));
        rationalNumber.add(new RationalNumber(1, 4));
        rationalNumber.add(new RationalNumber(2, 7));
        rationalNumber.add(new RationalNumber(1, 3));
        rationalNumber.add(new RationalNumber(3, 8));
        rationalNumber.add(new RationalNumber(2, 5));
        rationalNumber.add(new RationalNumber(3, 7));
        rationalNumber.add(new RationalNumber(1, 2));
        rationalNumber.add(new RationalNumber(4, 7));
        rationalNumber.add(new RationalNumber(3, 5));
        rationalNumber.add(new RationalNumber(5, 8));
        rationalNumber.add(new RationalNumber(2, 3));
        rationalNumber.add(new RationalNumber(5, 7));
        rationalNumber.add(new RationalNumber(3, 4));
        rationalNumber.add(new RationalNumber(4, 5));
        rationalNumber.add(new RationalNumber(5, 6));
        rationalNumber.add(new RationalNumber(6, 7));
        rationalNumber.add(new RationalNumber(7, 8));
        rationalNumber.add(new RationalNumber(1, 1));


        // сравниваем то, что получили, с тем, что ожидаем получить
        assertEquals(rationalNumber, actuals);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testOnNegative() throws Exception {
        RationalNumber d = new RationalNumber(3, 0);
    }
}