package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class IntegrationTesting {

    @Test
    public void testBeFriendsWithPairs() {
        List<Integer> animals = new ArrayList<>(List.of(1, 2, 3, 2));
        List<Integer> expected = List.of(1, 4, 2, 4, 3, 4, 2);
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsWithoutPairs() {
        List<Integer> animals = new ArrayList<>(List.of(1, 3, 4));
        List<Integer> expected = List.of(1, 3, 4);
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsMixedPairsAndNonPairs() {
        List<Integer> animals = new ArrayList<>(List.of(1, 2, 3, 4, 2, 3, 1, 2));
        List<Integer> expected = List.of(1, 4, 2, 4, 3, 4, 2, 4, 3, 1, 4, 2);
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsWithEmptyList() {
        List<Integer> animals = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsWithSingleElementList() {
        List<Integer> animals = new ArrayList<>(List.of(1));
        List<Integer> expected = List.of(1);
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsWithRepeatedPairs() {
        List<Integer> animals = new ArrayList<>(List.of(1, 2, 1, 2, 1, 2));
        List<Integer> expected = List.of(1, 4, 2, 4, 1, 4, 2, 4, 1, 4, 2);
        assertEquals(expected, App.beFriends(animals));
    }

    @Test
    public void testBeFriendsWithPairsAtTheEnd() {
        List<Integer> animals = new ArrayList<>(List.of(3, 4, 2, 3));
        List<Integer> expected = List.of(3, 4, 2, 4, 3);
        assertEquals(expected, App.beFriends(animals));
    }
}