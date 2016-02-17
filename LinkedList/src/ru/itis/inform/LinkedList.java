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
        Node newNode = this.first;
        for(int i = 0; i < count - 2; i++) {
            if(i == 0 && newNode.getValue() == element) {
                first = newNode.getNext();
                return;
            }
            if(newNode.getNext().getValue() == element) {
                if(i==0) {
                    first = newNode;
                    return;
                } else {
                    newNode.setNext(newNode.getNext().getNext());
                    return;
                }
            }
            newNode = newNode.getNext();
        }
        count--;
    }
    public void showList() {
        Node newNode = this.first;
        while (newNode!=null) {
            System.out.println(newNode.getValue());
            newNode = newNode.getNext();
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }
}