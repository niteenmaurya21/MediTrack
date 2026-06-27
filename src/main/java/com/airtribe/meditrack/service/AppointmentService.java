package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.Appointment;
import com.airtribe.meditrack.entity.AppointmentStatus;
import com.airtribe.meditrack.exception.AppointmentNotFoundException;
import com.airtribe.meditrack.util.DataStore;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<Integer, Appointment> appointmentMap = new HashMap<>();
    private DataStore<Appointment> appointmentStore = new DataStore<>();


    public void createAppointment(Appointment appointment) {
        appointmentStore.add(appointment);
        appointmentMap.put(appointment.getAppointmentId(), appointment);
    }

    public void viewAllAppointments() {
        appointmentStore.getAll().forEach(Appointment::display);
    }

    public Appointment searchAppointment(int appointmentId) {
        Appointment appointment = appointmentMap.get(appointmentId);
        if (appointment == null) {
            throw new AppointmentNotFoundException(
                    "Appointment with id " +appointmentId + " not found"
            );
        }
        return appointment;
    }

    public void removeAppointment(int appointmentId) {
        Appointment appointment = appointmentMap.remove(appointmentId);
        if(appointment != null) {
            appointmentStore.getAll().remove(appointment);
            System.out.println("Appointment removed successfully...");
        }
        else {
            System.out.println("Appointment not found...");
        }
    }

    public void cancelAppointment(int appointmentId) {
        Appointment appointment = searchAppointment(appointmentId);
        appointment.setStatus(AppointmentStatus.CANCELLED);
        System.out.println("Appointment Cancelled Successfully");
    }

    public Map<Integer, Appointment> getAppointmentMap() {
        return appointmentMap;
    }


    public DataStore<Appointment> getAppointmentStore() {
        return appointmentStore;
    }
}
