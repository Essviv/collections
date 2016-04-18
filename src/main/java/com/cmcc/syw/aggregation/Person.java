package com.cmcc.syw.aggregation;

/**
 * Created by sunyiwei on 16/4/14.
 */
public class Person {
    public enum Gender {
        MALE,
        FEMALE;
    }

    private Gender gender;
    private String name;
    private int age;

    public Person(Gender gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
