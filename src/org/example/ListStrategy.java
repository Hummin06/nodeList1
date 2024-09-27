package org.example;

public interface ListStrategy<T> {
    Node<T> add(Node<T> head, Node<T> newMyNode);
    Node<T> remove(Node<T> head);
}
