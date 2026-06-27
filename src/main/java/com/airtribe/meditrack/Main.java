package com.airtribe.meditrack;

import java.util.Scanner;

import com.airtribe.meditrack.entity.Doctor;
import com.airtribe.meditrack.entity.Specialization;
import com.airtribe.meditrack.service.AppointmentService;
import com.airtribe.meditrack.service.DoctorService;
import com.airtribe.meditrack.service.PatientService;

public class Main {
    private DoctorService doctorService = new DoctorService();
    private PatientService patientService = new PatientService();
    private AppointmentService appointmentService = new AppointmentService();
    private Scanner scanner = new Scanner(System.in);

    private boolean running = true;

    public static void main(String [] args ) {
        Main app = new Main();
        app.start();
    }
    public void start() {
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addDoctor();
                    break;

                case 2:
                    doctorService.viewAllDoctors();
                    break;

                case 9:
                    running = false;
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");


            }
        }
    }

    private void addDoctor() {

        System.out.print("Enter Doctor ID: ");
        String id = scanner.next();

        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        // Read specialization and fee...
        System.out.print("Enter Specialization (CARDIOLOGIST, DERMATOLOGIST, NEUROLOGIST, GENERAL_PHYSICIAN): ");
        String input = scanner.next().toUpperCase();

        Specialization specialization = Specialization.valueOf(input);

        System.out.print("Enter Consultation Fee: ");
        double fee = scanner.nextDouble();

        Doctor doctor = new Doctor(id, name, age, specialization, fee);

        doctorService.addDoctor(doctor);

        System.out.println("Doctor added successfully!");
    }



    private void showMenu() {

        System.out.println("\n===== MEDITRACK =====");

        System.out.println("1. Add Doctor");
        System.out.println("2. View Doctors");

        System.out.println("3. Add Patient");
        System.out.println("4. View Patients");

        System.out.println("5. Book Appointment");
        System.out.println("6. View Appointments");

        System.out.println("7. Search Appointment");

        System.out.println("8. Remove Appointment");

        System.out.println("9. Exit");

        System.out.print("Enter Choice : ");

    }


}
