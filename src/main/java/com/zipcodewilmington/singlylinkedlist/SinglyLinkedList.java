package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T>{
    private class Node{
        private Node next;
        private T content;

        public Node(T content){
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }

    private Node start;
    private Node end;
    private Integer position;

    public void add(T content){
        if(start == null){
            start = new Node(content);
            end = start;
        } else {
            end.next = new Node(content);
        }
    }

    public T get(Integer index){
        if(start == null)return null;
        position = 0;
        Node current = start;
        while(position < index){
            if(current.next == null)return null;
            else {
                current = current.next;
                position++;
            }
        }
        return current.getContent();
    }
}
