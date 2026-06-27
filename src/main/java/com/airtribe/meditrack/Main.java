package com.airtribe.meditrack;

import java.util.Scanner;
import com.airtribe.meditrack.service.AppointmentService;
import com.airtribe.meditrack.service.DoctorService;
import com.airtribe.meditrack.service.PatientService;

import java.util.Scanner;

public class Main {
    DoctorService doctorService = new DoctorService();
    PatientService patientService = new PatientService();
    AppointmentService appointmentService = new AppointmentService();
    Scanner scanner = new Scanner(System.in);

    boolean running = true;

    while (running) {
        //print menu

        int choice = scanner.nextInt();

        switch(choice) {
            case 1 :

        }
    }

}
