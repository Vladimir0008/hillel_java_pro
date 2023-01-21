package com.hillel.homeWork.Lesson17.unit_testing;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String path = "test/com/hillel/homeWork/Lesson17/result.txt";
        Path pathFile = Paths.get(path);
        File file = new File(path);

        System.out.println(path.toString());
        System.out.println(pathFile);
        System.out.println(file.getPath());

        TestResultParser testResultParser = new TestResultParser();
        System.out.println(testResultParser.parse(path));
        System.out.println(testResultParser.parse(pathFile));
        System.out.println(testResultParser.parse(file));

    }
}
