package com.hillel.homeWork.lesson10.task13.phonebook;


import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Entry> entryList;

    public PhoneBook() {
        this.entryList = new ArrayList<>();
    }

    public PhoneBook(List<Entry> entryList) {
        this.entryList = entryList;
    }

    public void add(Entry entry) {
        entryList.add(entry);
    }

    public Entry find(String name) {
        for (Entry e : entryList) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        List<Entry> result = new ArrayList<>();
        for (Entry e : entryList) {
            if (e.getName().equals(name)) {
                result.add(e);
            }
        }
        if(result.size() == 0 ) {
            return null;
        }
        return result;
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<Entry> entryList) {
        this.entryList = entryList;
    }
}
