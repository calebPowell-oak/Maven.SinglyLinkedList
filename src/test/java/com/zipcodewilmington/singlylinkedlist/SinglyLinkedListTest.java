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
}
