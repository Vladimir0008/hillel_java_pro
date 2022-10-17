package com.hillel.homeWork.lesson2;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int age) {

        if (name.length() > 50 || name.length() < 1) {
            System.out.println("Invalid value: name!");
        } else {
            this.name = name;
        }

        if (position.length() > 50 || position.length() < 1) {
            System.out.println("Invalid value: position!");
        } else {
            this.position = position;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid value: email!");
        } else {
            this.email = email;
        }

        if (phoneNumber.length() != 12) {
            System.out.println("Invalid value: phoneNumber!");
        } else {
            this.phoneNumber = phoneNumber;
        }
        if (age > 100 || age < 0) {
            System.out.println("Invalid value: age!");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 50 || name.length() < 1) {
            System.out.println("Invalid value: name!");
        } else
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.length() > 50 || position.length() < 1) {
            System.out.println("Invalid value: position!");
        } else
            this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Invalid value: email!");
        } else {
            this.email = email;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 12) {
            System.out.println("Invalid value: phoneNumber!");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            System.out.println("Invalid value: age!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
