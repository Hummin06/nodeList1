package org.example;

public class Main <T> {
    public static void main(String[] args) {
        QueueStrategy<Integer> queueStrategy = new QueueStrategy<>();
        StackStrategy<Integer> stackStrategy = new StackStrategy<>();
        List<Integer> list = new List<>(queueStrategy);
        list.add(5);
        list.add(7);
        list.setListStrategy(stackStrategy);
        list.add(10);
        list.add(154);
        Node<Integer> test = list.getHead();
        for(int i = 0; i != list.getSize(); i++){
            System.out.println( test);
            test = test.getNext();
        }
    }
}