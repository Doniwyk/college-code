import java.util.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patient Information");
            System.out.println("5. View Doctor Information");
            System.out.println("6. View Appointment Information (by Patient ID)");
            System.out.println("7. View Room Information");
            System.out.println("8. Assign Patient to Room");
            System.out.println("9. Exit");
            System.out.print("Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Gender: ");
                    String patientGender = scanner.nextLine();

                    Patient patient = new Patient(patientId, patientName, patientAge, patientGender);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.print("Doctor ID: ");
                    String doctorId = scanner.nextLine();
                    System.out.print("Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Age: ");
                    int doctorAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Gender: ");
                    String doctorGender = scanner.nextLine();
                    System.out.print("Specialization: ");
                    String doctorSpecialization = scanner.nextLine();

                    Doctor doctor = new Doctor(doctorId, doctorName, doctorAge, doctorGender, doctorSpecialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully!");
                    break;

                case 3:
                    System.out.print("Select Patient (Patient ID): ");
                    String selectedPatientId = scanner.nextLine();
                    System.out.print("Select Doctor (Doctor ID): ");
                    String selectedDoctorId = scanner.nextLine();
                    System.out.print("Appointment Date: ");
                    String appointmentDate = scanner.nextLine();
                    System.out.print("Appointment Time: ");
                    String appointmentTime = scanner.nextLine();

                    Patient selectedPatient = hospital.findPatientById(selectedPatientId);
                    Doctor selectedDoctor = hospital.findDoctorById(selectedDoctorId);

                    if (selectedPatient != null && selectedDoctor != null) {
                        Appointment appointment = new Appointment(selectedPatient, selectedDoctor, appointmentDate, appointmentTime);
                        System.out.println("Appointment scheduled successfully!");
                    } else {
                        System.out.println("Patient or doctor not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    String patientIdToSearch = scanner.nextLine();
                    Patient foundPatient = hospital.findPatientById(patientIdToSearch);

                    if (foundPatient != null) {
                        foundPatient.displayInfo();
                    } else {
                        System.out.println("Patient with ID " + patientIdToSearch + " not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Doctor ID: ");
                    String doctorIdToSearch = scanner.nextLine();
                    Doctor foundDoctor = hospital.findDoctorById(doctorIdToSearch);

                    if (foundDoctor != null) {
                        foundDoctor.displayInfo();
                    } else {
                        System.out.println("Doctor with ID " + doctorIdToSearch + " not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Patient ID: ");
                    String patientIdForAppointment = scanner.nextLine();

                    boolean foundAppointment = false;
                    for (Appointment appointment : hospital.getAppointments()) {
                        if (appointment.getPatient().getId().equals(patientIdForAppointment)) {
                            appointment.displayInfo();
                            foundAppointment = true;
                            break;
                        }
                    }

                    if (!foundAppointment) {
                        System.out.println("Appointment not found.");
                    }
                    break;

                case 7:
                    System.out.println("Room Information:");
                    List<Room> rooms = hospital.getRooms();
                    for (Room room : rooms) {
                        room.displayInfo();
                    }
                    break;

                case 8:
                    System.out.print("Select Patient (Patient ID): ");
                    String patientIdForRoomAssignment = scanner.nextLine();
                    Patient selectedPatientForRoomAssignment = hospital.findPatientById(patientIdForRoomAssignment);

                    if (selectedPatientForRoomAssignment != null) {
                        Room emptyRoom = hospital.findEmptyRoom();
                        if (emptyRoom != null) {
                            emptyRoom.occupy();
                            System.out.println("Patient assigned to Room " + emptyRoom.getRoomId());
                        } else {
                            System.out.println("No empty rooms available.");
                        }
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 9:
                    System.out.println("Thank you! Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
