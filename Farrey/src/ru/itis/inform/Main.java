package ru.itis.inform;

/**
 * Created by Sodium on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {
       FareySequenceGeneratorArrayImpl k = new FareySequenceGeneratorArrayImpl();
        k.generate(8);
        k.RationalNumberShow();
    }
}
