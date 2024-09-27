package org.example;

public class Main <T> {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(5);
        list.add(7);
        list.remove();
        Node<Integer> cur = list.getHead();
        for(int i = 0; i != list.getSize(); i++){
            System.out.println();

        }
    }
}