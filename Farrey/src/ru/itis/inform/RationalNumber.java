package ru.itis.inform;

/**
 * Created by Sodium on 10.02.2016.
 */
public class RationalNumber {
    private int a;
    private int b;
    public RationalNumber(){

    }
    public RationalNumber(int a, int b) {
        this.a=a;

        if(b==0) {
            throw new IllegalArgumentException();
        } else this.b=b;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
