package com.hillel.homeWork.lesson7.logger;

import com.hillel.homeWork.lesson7.formatter.FileFormatter;
import com.hillel.homeWork.lesson7.formatter.Formatter;

import java.io.File;

public class FileLoggerConfiguration {

    private File file = new File("src/com/hillel/homeWork/lesson7/log.txt");
    private LoggingLevel level = LoggingLevel.INFO;
    private long maxFileSize = 1270;
    private Formatter formatter = new FileFormatter();

    public FileLoggerConfiguration() {
    }

    public FileLoggerConfiguration(File file, LoggingLevel level, byte maxLogFileSize, Formatter formatter) {
        this.file = file;
        this.level = level;
        this.maxFileSize = maxLogFileSize;
        this.formatter = formatter;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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

    public void setMaxLogFileSize(byte maxLogFileSize) {
        this.maxFileSize = maxLogFileSize;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
}
