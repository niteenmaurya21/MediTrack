package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.util.Validator;

import java.io.Serializable;

public class Doctor extends Person implements Serializable {
    private Specialization specialization;
    private double consultationFee;

    public Doctor(String id, String name, int age, Specialization specialization, double consultationFee) {
        super(id, name, age);

        Validator.validateName(name);
        Validator.validateAge(age);
        Validator.validateFee(consultationFee);

        this.specialization = specialization;
        this.consultationFee = consultationFee;


    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
    @Override
    public void display() {
        System.out.println("Doctor Id: " +getId()+
                ", name : "+getName()+
                ", Specializaton : "+getSpecialization()+
                ", Fee : "+consultationFee);
    }
}
