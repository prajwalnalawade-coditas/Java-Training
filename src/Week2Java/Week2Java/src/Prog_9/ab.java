package Prog_9;

import java.util.*;

public class ab {

    public static void main(String[] args) {


        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(103, "Rahul");
        hashMap.put(101, "Amit");
        hashMap.put(105, "Neha");
        hashMap.put(102, "Priya");
        hashMap.put(104, "Karan");

        System.out.println("HashMap Output:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n");


        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(103, "Rahul");
        linkedHashMap.put(101, "Amit");
        linkedHashMap.put(105, "Neha");
        linkedHashMap.put(102, "Priya");
        linkedHashMap.put(104, "Karan");

        System.out.println("LinkedHashMap Output:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n-");


        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(103, "Rahul");
        treeMap.put(101, "Amit");
        treeMap.put(105, "Neha");
        treeMap.put(102, "Priya");
        treeMap.put(104, "Karan");

        System.out.println("TreeMap Output:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
