package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable>{
    class Node{
        private Node next;
        private T content;

        public Node(T content){
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node start;

    public SinglyLinkedList() {
        start = null;
    }

    public SinglyLinkedList(T content) {
        start = new Node(content);
    }

    public void add(T content){
        Node current = start;
        if(current == null){
            start = new Node(content);
        } else {
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(content);
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
    }

    public boolean contains(T content) {
        if(start == null) return false;
        Node current = start;
        while(current != null) {
            if(current.getContent() == content) return true;
            current = current.next;
        }
        return false;
    }

    public int find(T content) {
        if(start == null) return -1;
        Node current = start;
        int counter = 0;
        while(current != null) {
            if(current.getContent() == content) return counter;
            current = current.next;
            counter++;
        }
        return -1;
    }

    public int size() {
        if (start == null) return 0;
        Node current = start;
        int counter = 0;
        while (current != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> copy = new SinglyLinkedList<T>();
        if(start == null) return copy;
        Node current = start;
        while(current != null){
            copy.add(current.content);
            current = current.next;
        }
        return copy;
    }

    public void sort() {
        if(start == null) return;
        Node current = start;
        for(int i = 0; i < 3; i++){
            while(current.next != null){
                if(current.content.compareTo(current.next.content) > 0){
                    T holding = current.content;
                    current.content = current.next.content;
                    current.next.content = holding;
                }
                current = current.next;
            }
            current = start;
        }
    }

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
