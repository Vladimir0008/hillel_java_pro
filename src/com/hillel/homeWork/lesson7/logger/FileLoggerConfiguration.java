package com.hillel.homeWork.lesson7.logger;


public class FileLoggerConfiguration {

    private String filePath;
    private LoggingLevel level;
    private int maxFileSize;
    private String format;

    public FileLoggerConfiguration() {
    }

    public FileLoggerConfiguration(String filePath, LoggingLevel level, byte maxLogFileSize, String format) {
        this.filePath = filePath;
        this.level = level;
        this.maxFileSize = maxLogFileSize;
        this.format = format;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public long getMaxLogFileSize() {
        return maxFileSize;
    }

    public void setMaxLogFileSize(int maxLogFileSize) {
        this.maxFileSize = maxLogFileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
