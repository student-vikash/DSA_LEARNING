package map_interface;

import java.util.*;

public class SortHashMapOfStudentMarks {
    public static void main(String[] args) {
        // Created a HashMap with key-value pair data

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vikash", 78);
        map.put("Sachin", 89);
        map.put("Rahul", 79);
        map.put("Mayank", 96);

        // Printing the original HashMap
        System.out.println("Our Original HashMap: " + map);

        // Sorting the Student HashMap by its value

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        // Created a LinkedHashMap to maintain the order of insertion of the Student HashMap
        LinkedHashMap<String, Integer> sorted_st_Map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list)
        {
            sorted_st_Map.put(entry.getKey(), entry.getValue());
        }

        // Finally Printed the sorted HashMap  of Student HashMap by its value
        System.out.println("\n\nSorted HashMap by its Value: " + sorted_st_Map);
    }
}