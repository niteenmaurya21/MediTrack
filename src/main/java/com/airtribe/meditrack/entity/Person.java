package com.airtribe.meditrack.entity;

public abstract class Person {

    private String id;
    private String name;
    private int age ;

    public Person ( String id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void display();
}
