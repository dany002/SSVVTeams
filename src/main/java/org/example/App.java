package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> animals = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1,1,2,3,1));

        List<Integer> newArray = beFriends(animals);
        int[] etc = listToArray(newArray);
        System.out.println("New array: " + arrayToString(etc));
    }
    public static int findPair(List<Integer> list) {
        int a, b;
        for(int i = 0; i < list.size() - 1; i++){
            a = list.get(i);
            b = list.get(i+1);
            if ((a == 1 && b == 2) || (a == 2 && b == 1) || (a == 2 && b == 3) || (a == 3 && b == 2))
                return i;
        }
        return -1;
    }

    public static List<Integer> insertCow(List<Integer> initial_list, int poz){
        initial_list.add(poz,4);
        return initial_list;
    }

    public static List<Integer> beFriends(List<Integer> animals){
        while(findPair(animals) != -1)
            animals = insertCow(animals, findPair(animals) + 1);
        return animals;
    }

    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

