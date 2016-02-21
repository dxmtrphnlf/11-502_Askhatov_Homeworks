package ru.itis.inform;

public class FarreyLinkedListImpl {
    LinkedList<RationalNumber> generate(int n) {
        LinkedList<RationalNumber> rationalNumberLinkedList = new LinkedList<>();
        rationalNumberLinkedList.add(new RationalNumber(1, 1));
        rationalNumberLinkedList.add(new RationalNumber(0, 1));
        int i = 2;
        while (i <= n) {
            Iterator<RationalNumber> iterator = rationalNumberLinkedList.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                if (iterator.pikPrevious().getB() + iterator.pikNext().getB() == i)
                    iterator.insert(new RationalNumber(iterator.pikPrevious().getA() + iterator.pikNext().getA(), iterator.pikPrevious().getB() + iterator.pikNext().getB()));
                iterator.next();
            }
            i++;
        }

        return rationalNumberLinkedList;
    }
}