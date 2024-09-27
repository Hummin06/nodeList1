package org.example;

public class List <T> implements ListStrategy<T>{
    private Node<T> head;
     private int size;
     private ListStrategy<T> listStrategy;

    public ListStrategy<T> getListStrategy() {
        return listStrategy;
    }

    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }

    public List() {
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
        Node<T> cur = head;
        if(cur == null){
            cur.setValue(element);
            cur.setNext(null);
            size++;
        }
        else {
            for (int i = 0; i != size; i++) {
                cur = cur.getNext();
            }
            Node<T> node = new Node(element);
            cur.setNext(node);
            size++;
        }
    }

    @Override
    public Node<T> add(Node<T> head, Node<T> newMyNode) {
        return null;
    }

    @Override
    public Node<T> remove(Node<T> head) {
        return null;
    }


    public void remove (){
        Node<T> oldHead = head;
        head = head.getNext();
        oldHead.setNext(null);
        size--;
    }
}
