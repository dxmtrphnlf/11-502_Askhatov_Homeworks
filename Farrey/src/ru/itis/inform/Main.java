package ru.itis.inform;

public class Main {

    public static void main(String[] args) {

        FarreyArrayImpl array = new FarreyArrayImpl();
        RationalNumber numbers[] = array.generate(8);

        int j = 0;
        while (numbers[j + 1] != null) {
            System.out.print(numbers[j].getA() + "/" + numbers[j].getB() + ", ");
            j++;
        }
        System.out.print(numbers[j].getA() + "/" + numbers[j].getB() + ".");
    }
}