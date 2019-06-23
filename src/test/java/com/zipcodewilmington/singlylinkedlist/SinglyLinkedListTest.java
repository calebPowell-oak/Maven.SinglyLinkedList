package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void add() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer expected = 665;
        sll.add(expected);

        Integer actual = sll.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add1() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer expected = 665;
        sll.add(7);
        sll.add(expected);

        Integer actual = sll.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove1() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(0);
        Integer actual = sll.get(0);

        Assert.assertTrue(5 == actual);
        //removing first element, no.
    }

    @Test
    public void remove2() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(1);
        Integer actual = sll.get(1);

        Assert.assertTrue(6 == actual);
    }

    @Test
    public void remove3() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(7);
        sll.add(5);
        sll.add(6);

        sll.remove(2);
        Integer actual = sll.get(2);

        Assert.assertTrue(null == actual);
    }
}
