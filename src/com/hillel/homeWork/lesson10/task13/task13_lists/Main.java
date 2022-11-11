package com.hillel.homeWork.lesson10.task13.task13_lists;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        InitInputData initInputData = new InitInputData();
        ListSandbox listSandbox = new ListSandbox();

        //Point1
        int sisterCount = listSandbox.countOccurrence(initInputData.getListTask1(),"sister");
        int grandmaCount = listSandbox.countOccurrence(initInputData.getListTask1(),"grandma");
        System.out.println(sisterCount);
        System.out.println(grandmaCount);

        //Point2
        List<Integer> list = listSandbox.toList(initInputData.getArrayTask2());
        System.out.println(list);
        System.out.println(list.size());

        //Point3
        Set<Integer> set = listSandbox.findUniqueInt(initInputData.getListTask3());
        System.out.println(set);

        //Point4
        Map<String, Integer> map = listSandbox.findOccurrence(initInputData.getListTask1());
        System.out.println(map);
    }
}
