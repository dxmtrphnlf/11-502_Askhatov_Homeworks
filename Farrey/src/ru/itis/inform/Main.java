package ru.itis.inform;

public class Main {

    public static void main(String[] args) {

        FarreyArrayImpl array = new FarreyArrayImpl();
        RationalNumber rationalNumberlist[] = array.runFloyd(8);

        int i = 0;
        while (rationalNumberlist[i] != null) {
            System.out.print(rationalNumberlist[i].getA() + "/" + rationalNumberlist[i].getB() + " ");
            i++;
        }
    }
}