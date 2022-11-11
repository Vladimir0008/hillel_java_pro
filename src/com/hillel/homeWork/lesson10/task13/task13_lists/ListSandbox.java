package com.hillel.homeWork.lesson10.task13.task13_lists;

import java.util.*;

public class ListSandbox {

    public int countOccurrence(List<String> list, String searchWord) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searchWord)) {
                result++;
            }
        }
        return result;
    }

    public List<Integer> toList(int[] intArray) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            result.add(intArray[i]);
        }
        return result;
    }

    public Set<Integer> findUniqueInt(List<Integer> list) {
        Set<Integer> result = new HashSet<>();
        result.addAll(list);
        return result;
    }

    public Set<String> findUniqueString(List<String> list) {
        Set<String> result = new HashSet<>();
        result.addAll(list);
        return result;
    }

    public Map<String, Integer> findOccurrence(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        Set<String> set = findUniqueString(list);

        for (String e : set) {
            result.put(e, countOccurrence(list, e));
        }
        return result;
    }
}
