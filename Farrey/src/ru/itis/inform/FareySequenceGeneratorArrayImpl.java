package ru.itis.inform;

/**
 * Created by Sodium on 10.02.2016.
 */
public class FareySequenceGeneratorArrayImpl {
    RationalNumber[] list = new RationalNumber[100];
    public RationalNumber[] generate(int n) {
        boolean d=true;
        RationalNumber t;
        list[0] = new RationalNumber(0,1);
        list[1] = new RationalNumber(1,1);
        for (int i = 2; i < 100; i++)
            list[i] = new RationalNumber();
        // работает неправильно, ошибку найти не смог
        while (d) {
            d=false;
            for(int i = 0; i<98; i++) {
                if (list[i].getB() + list[i + 1].getB() < (n + 1)) {
                    t = list[i + 1];
                    list[i + 1] = new RationalNumber((list[i].getA() + list[i + 1].getA()), (list[i].getB() + list[i + 1].getB()));
                    list[i + 2] = t;
                    d = true;
                }
            }
        }
        return list;
    }

    public void RationalNumberShow() {
        for(int i=0; i<100;i++) {
            System.out.println(list[i].getA()+"/"+list[i].getB());
        }
    }
}
