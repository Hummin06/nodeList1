package org.example;

public class StackStrategy <T> implements ListStrategy<T>{
    @Override
    public Node<T> add(Node<T> head, Node<T> newMyNode) {
        newMyNode.setNext(head);
        return newMyNode;
    }

    @Override
    public Node<T> remove(Node<T> head) {
        Node<T> iter = head;
        Node<T> next = iter.getNext();
        while (next.getNext() != null) {
            iter.setNext(iter.getNext());
            next = iter.getNext();
        }
        iter.setNext(null);
        return head;
    }
}
