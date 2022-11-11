package com.hillel.homeWork.lesson10.task13.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Entry("Bob", "+380501111111"));
        phoneBook.add(new Entry("Bob", "+380501111112"));
        phoneBook.add(new Entry("Bob", "+380501111113"));
        phoneBook.add(new Entry("Sara", "+38050222221"));
        phoneBook.add(new Entry("Sara", "+38050222222"));
        phoneBook.add(new Entry("Josh", "+380503333333"));

        System.out.println(phoneBook.find("Bob"));
        System.out.println(phoneBook.find("Nila"));
        System.out.println(phoneBook.findAll("Bob"));
        System.out.println(phoneBook.findAll("Nila"));
    }
}
