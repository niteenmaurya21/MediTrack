package com.airtribe.meditrack.service;


import com.airtribe.meditrack.entity.Patient;
import com.airtribe.meditrack.util.DataStore;

import java.util.HashMap;
import java.util.Map;

public class PatientService {
    private Map<String, Patient> patientMap = new HashMap<>();
    private DataStore<Patient> patientStore = new DataStore<>();
    public void addPatient(Patient patient) {
        patientStore.add(patient);
        patientMap.put(
                patient.getId(),patient
        );
    }
    public void viewAllPatients() {
        patientStore.getAll().forEach(Patient::display);
    }
    public Patient searchPatient(String patientId) {
        return patientMap.get(patientId);
    }
    public DataStore<Patient> getPatientStore() {
        return patientStore;
    }
    public void removePatient(String patientId) {
        Patient patient = patientMap.remove(patientId);
        if(patient !=null) {
            patientStore.getAll().remove(patient);
            System.out.println("Patient removed successfully.");
        }
        else {
            System.out.println("Patient not found");
        }
    }
}
