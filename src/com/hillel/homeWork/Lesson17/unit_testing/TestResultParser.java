package com.hillel.homeWork.Lesson17.unit_testing;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class TestResultParser {

    public TestResult parse(String filePath) {
        return parseFile(filePath);
    }

    public TestResult parse(File file) {
        return parseFile(file.getPath());
    }

    public TestResult parse(Path path) {
        return parseFile(path.toString());
    }

    public TestResult parseFile(String pathName) {
        TestResult testResult = new TestResult();
        File file = new File(pathName);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if (line.contains("Local date")) {
                    testResult.setLocalDateTime(parseDateTime(line));
                }
                if (line.contains("tests started")) {
                    testResult.setTotalTestCount(parseIntValue(line));
                }
                if (line.contains("tests successful")) {
                    testResult.setTotalSuccessfulTestCount(parseIntValue(line));
                }
                if (line.contains("tests failed")) {
                    testResult.setTotalFailedTestCount(parseIntValue(line));
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testResult;
    }

    public LocalDateTime parseDateTime(String line) {
        return LocalDateTime.parse(line.split(" ")[2]);
    }

    public int parseIntValue(String line) {
        return Integer.parseInt(line.replaceAll("[^0-9]", ""));
    }
}
