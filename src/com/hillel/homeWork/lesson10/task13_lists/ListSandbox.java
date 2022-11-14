package com.hillel.homeWork.lesson10.task13_lists;

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

    public List<Integer> findUniqueInt(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        result.addAll(set);
        return result;
    }

    public List<String> findUniqueString(List<String> list) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.addAll(list);
        result.addAll(set);
        return result;
    }

    public List<WordOccurrence> findOccurrence(List<String> list) {
        List<WordOccurrence> wordOccurrenceList = new ArrayList<>();

        for (String uniqueWord : findUniqueString(list)) {
            wordOccurrenceList.add(new WordOccurrence(uniqueWord, countOccurrence(list, uniqueWord)));
        }
        return wordOccurrenceList;
    }
}
