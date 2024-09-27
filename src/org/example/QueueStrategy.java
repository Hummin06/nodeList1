package org.example;

public class QueueStrategy<T> implements ListStrategy<T>{
    @Override
    public Node<T> add(Node<T> head, Node<T> newMyNode) {
        Node<T> iter = head;
        while (iter.getNext() != null) {
            iter.setNext(newMyNode);
        }
        return head;
    }

    @Override
    public Node<T> remove(Node<T> head) {
        Node <T> newHead = head.getNext();
        head.setNext(null);
        return newHead;
    }
}
