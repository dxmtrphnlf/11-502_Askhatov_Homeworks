public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(7);
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        iterator.insert(63);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
