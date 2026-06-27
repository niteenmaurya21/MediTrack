package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.util.Validator;

import java.io.Serializable;

public class Patient extends Person implements Cloneable, Serializable {

    private String disease;

    public Patient(String id, String name, int age, String disease) {
        super(id, name, age);

        Validator.validateName(name);
        Validator.validateAge(age);
        Validator.validateDisease(disease);

        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }
    @Override
    public Patient clone() {
        try {
            return (Patient) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void display() {
        System.out.println("Patient ID: " +getId() +
        ", Name :" + getName() + ", Disease :"+ disease);
    }
}
