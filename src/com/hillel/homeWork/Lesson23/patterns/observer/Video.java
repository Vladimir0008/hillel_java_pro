package com.hillel.homeWork.Lesson23.patterns.observer;

import java.time.LocalDateTime;

public class Video {

    private final String name;
    private final String authorName;
    private final LocalDateTime localDateTime;

    public Video(String name, String authorName, LocalDateTime localDateTime) {
        this.name = name;
        this.authorName = authorName;
        this.localDateTime = localDateTime;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

