package ru.itis.inform;

public class LinkedList<T> implements List<T> {
    private Node<T> first;

    private int count;

    public LinkedList() {
        this.first = null;
        this.count = 0;
    }

    // Когда добавляете, учтите, что еще есть previous
    public void add(T element) {
        Node newNode = new Node<T>(element);
        newNode.setPrevious(null);
        if (first == null) {
            this.first = newNode;
        } else {
            newNode.setNext(this.first);
            first.setPrevious(newNode);
            first = newNode;
        }
        this.count++;
    }

    @Override
    public void remove(T element) {
        if(first == null) {
            System.out.println("Список пуст");
            return;
        }
        if (first.getValue().equals(element)) {
            first = first.getNext();
            return;
        }
        Node<T> newNode = first;
        while (newNode.getNext() != null) {
            if (newNode.getNext().getValue().equals(element)) {
                newNode.setNext(newNode.getNext().getNext());
                return;
            }
            newNode = newNode.getNext();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }
}
