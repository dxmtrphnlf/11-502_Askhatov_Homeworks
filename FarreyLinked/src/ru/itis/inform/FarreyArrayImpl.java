package ru.itis.inform;

import java.util.LinkedList;

public class FarreyArrayImpl {

    public FarreyArrayImpl() {
    }

    public LinkedList<RationalNumber> runFloyd(int n) {
        // не знал, надо было свой класс написать или воспользоваться уже существующим. Воспользовался существующим.
        LinkedList<RationalNumber> list = new LinkedList<RationalNumber>();

        list.add(0, new RationalNumber(0, 1));
        list.add(1, new RationalNumber(1, 1));

        int count = 2;
        for (int i = 2; i <= n; i++)
            for (int j = 0; j <= count - 2; j++) {

                if (list.get(j) != null && list.get(j+1) != null && list.get(j).getB()+list.get(j+1).getB()==i) {
                    RationalNumber mid = new RationalNumber((list.get(j).getA() + list.get(j+1).getA()), (list.get(j).getB() + list.get(j+1).getB()));
                    list.add(j+1, mid);
                    count++;
                }
            }
        return list;
    }
}