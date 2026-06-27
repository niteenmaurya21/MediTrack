package com.airtribe.meditrack.util;

public class IdGenerator {
    private static int doctorCounter;
    private static int patientCounter;
    private static int appointmentCounter;

    static {
        doctorCounter=100;
        patientCounter=100;
        appointmentCounter=100;
    }
    public static String generateDoctorId() {
        return "D"  +(++doctorCounter);
    }
}
