package mate.academy.lessons.collection.LL;

import java.util.Arrays;

/**
 * @author Sergey Klunniy
 * односвязный не параметризованный
 */
public class MyLinkedList {
    private Node head;
    private int size;

    @Override
    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public void add(int value) {
        //если это первое добавление в список
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }

        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;


        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }


    public int get(int index) {
//        int[] result = new int[size];
//        int idx = 0;
//        Node temp = head;
//        while (temp != null) {
//            result[idx++] = temp.getValue();
//            temp = temp.getNext();
//        }
//
//        return result[index];

        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }


    private static class Node {

        private Node next; //ссылка на следующий узел
        private int value;  // значение

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
