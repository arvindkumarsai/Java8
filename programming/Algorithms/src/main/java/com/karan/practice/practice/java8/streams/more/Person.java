package com.karan.practice.practice.java8.streams.more;

public class Person {

    Gender gender;
    String name;

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}

enum Gender {MALE, FEMALE, OTHER}