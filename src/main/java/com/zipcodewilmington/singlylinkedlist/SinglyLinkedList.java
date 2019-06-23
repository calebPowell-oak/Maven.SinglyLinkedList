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

    public void add(T content){
        if(start == null){
            start = new Node(content);
            end = start;
        } else {
            end.next = new Node(content);
            end = end.next; // I don't want this anymore, I don't like it.
        }
    }

    public void remove(Integer index) {
        if(start == null){
            return;
        } else if(index == 0){
            start = start.next;
        }

        Node current = start;
        for(int i = 0; i < index - 1; i++) {
            if(current.next == null) return;
            current = current.next;
        }
        current.next = current.next.next;
        if(current.next.next == null){
            end = current;
        }
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (obj == null || obj.getClass() != this.getClass()) {
//            return false;
//        }
//
//        Node current = this.start;
//        SinglyLinkedList other = (SinglyLinkedList) obj;
//        other = other.getStart();
//        while(current != null){
//            if(other.getContent() != current.getContent()){
//                return false;
//            }
//        }
//    }

    public T get(Integer index){
        if(start == null)return null;
        Node current = start;
        for(int i = 0; i < index; i++){
            if(current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }
        return current.getContent();
    }

    public Node getStart() {
        return start;
    }
}
