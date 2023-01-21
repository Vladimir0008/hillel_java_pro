package com.hillel.homeWork.Lesson17.unit_testing;

import java.time.LocalDateTime;

public class TestResult {
    private int totalTestCount;
    private int totalSuccessfulTestCount;
    private int totalFailedTestCount;
    private LocalDateTime localDateTime;


    public TestResult(int totalTestCount, int totalSuccessfulTestCount, int totalFailedTestCount) {
        this.totalTestCount = totalTestCount;
        this.totalSuccessfulTestCount = totalSuccessfulTestCount;
        this.totalFailedTestCount = totalFailedTestCount;
    }

    public TestResult() {

    }

    public int getTotalTestCount() {
        return totalTestCount;
    }

    public void setTotalTestCount(int totalTestCount) {
        this.totalTestCount = totalTestCount;
    }

    public int getTotalSuccessfulTestCount() {
        return totalSuccessfulTestCount;
    }

    public void setTotalSuccessfulTestCount(int totalSuccessfulTestCount) {
        this.totalSuccessfulTestCount = totalSuccessfulTestCount;
    }

    public int getTotalFailedTestCount() {
        return totalFailedTestCount;
    }

    public void setTotalFailedTestCount(int totalFailedTestCount) {
        this.totalFailedTestCount = totalFailedTestCount;
    }

    public LocalDateTime getTotalExecTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "totalTestCount=" + totalTestCount +
                ", totalSuccessfulTestCount=" + totalSuccessfulTestCount +
                ", totalFailedTestCount=" + totalFailedTestCount +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
