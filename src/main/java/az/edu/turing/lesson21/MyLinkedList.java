package az.edu.turing.lesson21;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addHead(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void update(int index, E newData) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = newData;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void delete(E data) {
        Node<E> current = head;
        Node<E> prev = null;
        while (current != null) {
            if (current.data.equals(data)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addHead(3);
        list.addHead(5);
        list.addHead(7);
        list.addHead(9);

        System.out.println("Size: " + list.getSize());

        System.out.println("Element at index 2: " + list.get(2));

        list.update(1, 6);
        System.out.println("Updated element at index 1: " + list.get(1));

        list.delete(2);
        System.out.println("Size after deletion: " + list.getSize());

        list.delete(6);
        System.out.println("Size after deletion by value: " + list.getSize());
    }
}

