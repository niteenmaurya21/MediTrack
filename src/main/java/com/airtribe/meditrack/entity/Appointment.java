package com.airtribe.meditrack.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Appointment implements Serializable {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDate localDate;
    private AppointmentStatus status;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public Appointment(int appointmentId, Patient patient, Doctor doctor, LocalDate localDate, AppointmentStatus status) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.localDate = localDate;
        this.status = status;

    }

    public void display() {
        System.out.println("AppointmentID : "+ getAppointmentId()+
                ", Patient :" +patient.getName()+
                ", Doctor : "+ doctor.getName()+
                ", Date :"+localDate+
                ", status : "+status);
    }
}
