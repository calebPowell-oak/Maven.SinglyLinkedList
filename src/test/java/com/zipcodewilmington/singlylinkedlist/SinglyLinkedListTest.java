package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void add_HappyPath() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        Integer expected = 665;
        sll.add(expected);

        Integer actual = sll.getStart().getNext().getContent();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add_RepeatedAdding() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(123456);
        Integer expected = 665;

        sll.add(expected);
        sll.add(expected);

        Integer actual = sll.getStart().getNext().getNext().getContent();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add_emptyListFromDefaultConstructor() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer expected = 665;

        sll.add(expected);

        Integer actual = sll.getStart().getContent();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains_happyPath() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        Assert.assertTrue(sll.contains(5));
    }

    @Test
    public void contains_falseOnEmptyList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Assert.assertFalse(sll.contains(5));
    }

    @Test
    public void contains_happyPathLongerList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        sll.add(10);
        Assert.assertTrue(sll.contains(10));
    }

    @Test
    public void contains_falseOnLongerList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        sll.add(10);
        Assert.assertFalse(sll.contains(7));
    }

    @Test
    public void find_happyPath() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        sll.add(10);
        Integer actual = sll.find(10);
        Assert.assertTrue(actual == 1);
    }

    @Test
    public void find_emptyList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer actual = sll.find(10);
        Assert.assertTrue(actual == -1);
    }

    @Test
    public void find_notInList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        sll.add(10);
        Integer actual = sll.find(666);
        Assert.assertTrue(actual == -1);
    }

    @Test
    public void size_happyPath() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        sll.add(10);
        Integer actual = sll.size();
        Assert.assertEquals(new Integer(2), actual);
    }

    @Test
    public void size_oneNode() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        Integer actual = sll.size();
        Assert.assertEquals(new Integer(1), actual);
    }

    @Test
    public void size_emptyList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer actual = sll.size();
        Assert.assertEquals((Integer) 0, actual);
    }

    @Test
    public void get_happyPath() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(5);
        Integer actual = sll.get(0);
        Assert.assertEquals((Integer) 5, actual);
    }

    @Test
    public void get_emptyList() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer actual = sll.get(0);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void get_indexGreaterThanLength() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer actual = sll.get(2);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void remove_removeFirstElement() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(0);
        Integer actual = sll.get(0);

        Assert.assertTrue(5 == actual);
    }

    @Test
    public void remove_removeMiddleElement() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(1);
        Integer actual = sll.get(1);

        Assert.assertTrue(6 == actual);
    }

    @Test
    public void remove_removeLastElement() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(2);
        Integer actual = sll.get(2);

        Assert.assertTrue(null == actual);
    }

    @Test
    public void copy_checkFirst(){
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
        sll.add("Caleb");
        sll.add("Lee");
        sll.add("Powell");

        SinglyLinkedList<String> copy = sll.copy();

        Assert.assertTrue(sll.get(0).equals(copy.get(0)));
    }

    @Test
    public void copy_checkMiddle(){
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
        sll.add("Caleb");
        sll.add("Lee");
        sll.add("Powell");

        SinglyLinkedList<String> copy = sll.copy();

        Assert.assertTrue(sll.get(1).equals(copy.get(1)));
    }

    @Test
    public void copy_checkLast(){
        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
        sll.add("Caleb");
        sll.add("Lee");
        sll.add("Powell");

        SinglyLinkedList<String> copy = sll.copy();

        Assert.assertTrue(sll.get(2).equals(copy.get(2)));
    }

    @Test
    public void get() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(2);
    }
}
