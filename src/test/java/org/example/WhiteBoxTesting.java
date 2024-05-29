package org.example;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.example.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class WhiteBoxTesting {

    @Test
    public void testInsertCowAtBeginning() {
        List<Integer> initialList = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expectedList = List.of(4, 1, 2, 3);
        assertEquals(expectedList, App.insertCow(initialList, 0));
    }

    @Test
    public void testInsertCowAtMiddle() {
        List<Integer> initialList = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expectedList = List.of(1, 4, 2, 3);
        assertEquals(expectedList, App.insertCow(initialList, 1));
    }

    @Test
    public void testInsertCowAtEnd() {
        List<Integer> initialList = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expectedList = List.of(1, 2, 3, 4);
        assertEquals(expectedList, App.insertCow(initialList, 3));
    }

    @Test
    public void testInsertCowInEmptyList() {
        List<Integer> initialList = new ArrayList<>();
        List<Integer> expectedList = List.of(4);
        assertEquals(expectedList, App.insertCow(initialList, 0));
    }

    @Test
    public void testInsertCowWithSingleElement() {
        List<Integer> initialList = new ArrayList<>(List.of(1));
        List<Integer> expectedList = List.of(4, 1);
        assertEquals(expectedList, App.insertCow(initialList, 0));
    }

    @Test
    public void testInsertCowWithNegativeIndex() {
        List<Integer> initialList = new ArrayList<>(List.of(1, 2, 3));
        try {
            App.insertCow(initialList, -1);
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index: -1, Size: 3", e.getMessage());
        }
    }

    @Test
    public void testInsertCowWithIndexOutOfBounds() {
        List<Integer> initialList = new ArrayList<>(List.of(1, 2, 3));
        try {
            App.insertCow(initialList, 4);
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index: 4, Size: 3", e.getMessage());
        }
    }
}