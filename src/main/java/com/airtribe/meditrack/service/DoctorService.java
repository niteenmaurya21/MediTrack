package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.util.DataStore;

import java.util.HashMap;
import java.util.Map;

public class DoctorService {
    private Map<String, Doctor> doctorMap= new HashMap<>();

    private DataStore<Doctor> doctorStore = new DataStore<>();
    public void addDoctor(Doctor doctor) {
        doctorStore.add(doctor);
        doctorMap.put(
                doctor.getId(),doctor
        );
    }
    public void viewAllDoctors() {
        doctorStore.getAll().forEach(Doctor::display);
    }
    public Doctor searchDoctor(String doctorId) {
        return doctorMap.get(doctorId);
    }
    public DataStore<Doctor> getDoctorStore() {
        return doctorStore;
    }
    public void removeDoctor(String doctorId) {
        Doctor doctor = doctorMap.remove(doctorId);
        if(doctor !=null) {
            doctorStore.getAll().remove(doctor);
            System.out.println("Doctor removed successfully.");
        }
        else {
            System.out.println("Doctor not found");
        }
    }
}
