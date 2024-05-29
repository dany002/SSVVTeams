package org.example;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.example.App;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

public class BlackboxTesting {
    // 1 - mouse
    // 2 - cat
    // 3 - dog
    // 4 - cow

    @Test
    public void testFindPairWithMouseCatPair() {
        List<Integer> animals = Arrays.asList(1, 2, 3, 4);
        int index = App.findPair(animals);
        assertEquals(0, index);  // Mouse-cat pair is at the start
    }

    @Test
    public void testFindPairWithCatDogPair() {
        List<Integer> animals = Arrays.asList(4, 2, 3, 1);
        int index = App.findPair(animals);
        assertEquals(1, index);  // Cat-dog pair is at index 1
    }

    @Test
    public void testFindPairWithCatMousePair() {
        List<Integer> animals = Arrays.asList(4, 3, 2, 1);
        int index = App.findPair(animals);
        assertEquals(1, index);  // Cat-mouse pair is at index 1
    }

    @Test
    public void testFindPairWithDogCatPair() {
        List<Integer> animals = Arrays.asList(3, 2, 1, 4);
        int index = App.findPair(animals);
        assertEquals(0, index);  // Dog-cat pair is at the start
    }

    @Test
    public void testFindPairWithNoPair() {
        List<Integer> animals = Arrays.asList(1, 3, 4, 4);
        int index = App.findPair(animals);
        assertEquals(-1, index);  // No pair found
    }

    @Test
    public void testFindPairWithEmptyList() {
        List<Integer> animals = Arrays.asList();
        int index = App.findPair(animals);
        assertEquals(-1, index);  // No pair in an empty list
    }

    @Test
    public void testFindPairWithSingleElement() {
        List<Integer> animals = Arrays.asList(1);
        int index = App.findPair(animals);
        assertEquals(-1, index);  // No pair with a single element
    }

    @Test
    public void testFindPairWithMultiplePairs() {
        List<Integer> animals = Arrays.asList(1, 2, 1, 3, 2);
        int index = App.findPair(animals);
        assertEquals(0, index);  // The first pair (mouse-cat) at index 0
    }

    @Test
    public void testFindPairWithAdjacentPairs() {
        List<Integer> animals = Arrays.asList(1, 2, 2, 3);
        int index = App.findPair(animals);
        assertEquals(0, index);  // The first pair (mouse-cat) at index 0
    }

    @Test
    public void testFindPairWithSameElements() {
        List<Integer> animals = Arrays.asList(2, 2, 2, 2);
        int index = App.findPair(animals);
        assertEquals(-1, index);  // No valid pairs
    }

}
