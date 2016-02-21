public class Main {

    public static void main(String[] args) {
        FarreyLinkedListImpl rationalNumbers = new FarreyLinkedListImpl();
        LinkedList<RationalNumber> listOfNumbers = rationalNumbers.generate(8);
        Iterator<RationalNumber> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.pikNext().getA() + "/" + iterator.pikNext().getB() + "  ");
            iterator.next();
        }
    }
}