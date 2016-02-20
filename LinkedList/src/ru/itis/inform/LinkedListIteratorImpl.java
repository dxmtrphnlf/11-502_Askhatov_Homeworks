package ru.itis.inform;

import java.util.InvalidPropertiesFormatException;

class LinkedListIteratorImpl<T> implements Iterator<T> {

    Node<T> current;

    public LinkedListIteratorImpl(Node<T> first) {
        this.current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }

    @Override
    public T previous() {
        // добавить проверку, что вообще перед ним что-то есть!!!!!
        if (current.getPrevious() != null) {
            return current.getPrevious().getValue();
        } else System.out.println("Предыдущий элемент отсутствует.");
        return null;
    }

    @Override
    public void insert(T element) {
        Node<T> newNode = new Node<>(element);
        Node<T> current = this.current;
        if(current.getPrevious()!=null && current.getNext()!=null) {
            newNode.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newNode);
            newNode.setNext(current);
            current.setPrevious(newNode);
            this.current = current.getPrevious();
        } else System.out.println("Следующий/предыдущий элемент не найден.");
    }
    public T peakNext() {
        return current.getNext().getValue();
    }
    public T peakPrevious() {
        return current.getNext().getValue();
    }
}

