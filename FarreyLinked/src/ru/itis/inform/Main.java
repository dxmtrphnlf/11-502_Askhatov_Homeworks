package ru.itis.inform;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        FarreyArrayImpl array = new FarreyArrayImpl();
        LinkedList<RationalNumber> rationalNumberlist = array.runFloyd(8);

        int i = 0;
       for(RationalNumber d: rationalNumberlist){
           System.out.println(d.getA()+"/"+d.getB());
       }
    }
}