package org.example;

public class List <T> {
    private Node<T> head;
     private int size;
     private ListStrategy<T> listStrategy;

    public ListStrategy<T> getListStrategy() {
        return listStrategy;
    }

    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }

    public List(QueueStrategy<Integer> queueStrategy) {
        this.listStrategy = listStrategy;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T element){
        Node<T> newNode = new Node<T>(element);
        if (head != null) {
            head = newNode;
        } else {
            listStrategy.add(head, newNode);
            size++;
        }
    }


    public void remove (){
        listStrategy.remove(head);
        size--;
    }
}
