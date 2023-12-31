import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Hospital hospital = new Hospital();

    public static void main(String[] args) {
        while (true) {
            displayRoleSelectionMenu();
            int roleChoice = getUserChoice();

            switch (roleChoice) {
                case 1 -> adminMenu();
                case 2 -> receptionistMenu();
                case 3 -> doctorMenu();
                case 4 -> labStaffMenu();
                case 5 -> exitProgram();
                default -> System.out.println("Invalid role choice. Please try again.");
            }
        }
    }

    private static void displayRoleSelectionMenu() {
        System.out.println("\n==== SELECT ROLE ====");
        System.out.printf("| %-17s |\n", "1. Admin");
        System.out.printf("| %-17s |\n", "2. Receptionist");
        System.out.printf("| %-17s |\n", "3. Doctor");
        System.out.printf("| %-17s |\n", "4. Lab Staff");
        System.out.printf("| %-17s |\n", "5. Exit");
        System.out.println("=====================");
        System.out.print("Enter your role choice: ");
    }

    private static int getUserChoice() {
        return scanner.nextInt();
    }

    private static void adminMenu() {
        boolean exitAdmin = false;
        while (!exitAdmin) {
            System.out.println("\n=========== ADMIN MENU ===========");
            System.out.printf("| %-30s |\n", "1. Add Staff");
            System.out.printf("| %-30s |\n", "2. Remove Staff");
            System.out.printf("| %-30s |\n", "3. View Staff Information");
            System.out.printf("| %-30s |\n", "4. View Patient Information");
            System.out.printf("| %-30s |\n", "5. Back to Role Selection");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");
            int adminChoice = getUserChoice();

            switch (adminChoice) {
                case 1 -> addStaffMenu();
                case 2 -> removeStaffMenu();
                case 3 -> viewStaffInformationMenu();
                case 4 -> {
                    System.out.print("Enter Patient ID: ");
                    String patientIdToView = scanner.next();
                    hospital.viewPatientInformation(patientIdToView);
                }
                case 5 -> exitAdmin = true;

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStaffMenu() {
        boolean exitAddStaffMenu = false;
        while (!exitAddStaffMenu) {
            System.out.println("\n========= Add Staff =========");
            System.out.printf("| %-25s |\n", "1. Add Doctor");
            System.out.printf("| %-25s |\n", "2. Add Nurse");
            System.out.printf("| %-25s |\n", "3. Add lab Staff");
            System.out.printf("| %-25s |\n", "4. Back to Admin Menu");
            System.out.println("=============================");
            System.out.print("Enter your choice: ");

            int addStaffChoice = getUserChoice();

            switch (addStaffChoice) {
                case 1 -> {
                    // Add Doctor
                    System.out.print("Doctor ID: ");
                    String doctorId = scanner.next();
                    System.out.print("Name: ");
                    String doctorName = scanner.next();
                    System.out.print("Age: ");
                    int doctorAge = scanner.nextInt();
                    System.out.print("Gender: ");
                    String doctorGender = scanner.next();
                    System.out.print("Specialization: ");
                    String doctorSpecialization = scanner.next();
                    Doctor doctor = new Doctor(doctorId, doctorName, doctorAge, doctorGender, doctorSpecialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully!");
                }
                case 2 -> {
                    // Add Nurse
                    System.out.print("Nurse ID: ");
                    String nurseId = scanner.next();
                    System.out.print("Name: ");
                    String nurseName = scanner.next();
                    System.out.print("Age: ");
                    int nurseAge = scanner.nextInt();
                    System.out.print("Gender: ");
                    String nurseGender = scanner.next();
                    System.out.print("Department: ");
                    String nurseDepartment = scanner.next();
                    Nurse nurse = new Nurse(nurseId, nurseName, nurseAge, nurseGender,nurseDepartment);
                    hospital.addNurse(nurse);
                    System.out.println("Nurse added successfully!");
                }
                case 3 -> {
                    // Add Lab Staff
                    System.out.print("Lab Staff ID: ");
                    String labStaffId = scanner.next();
                    System.out.print("Name: ");
                    String labStaffName = scanner.next();
                    System.out.print("Age: ");
                    int labStaffAge = scanner.nextInt();
                    System.out.print("Gender: ");
                    String labStaffGender = scanner.next();
                    System.out.println("Specialization: ");
                    String labStaffSpecialization = scanner.next();
                    LabStaff staff = new LabStaff(labStaffId, labStaffName, labStaffAge, labStaffGender, labStaffSpecialization);
                    hospital.addLabStaff(staff);
                    System.out.println("Lab Staff added successfully!");
                }
                case 4 -> exitAddStaffMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void removeStaffMenu() {
        boolean exitRemoveStaffMenu = false;
        while (!exitRemoveStaffMenu) {
            System.out.println("\n======== REMOVE STAFF =======");
            System.out.printf("| %-25s |\n", "1. Remove Doctor");
            System.out.printf("| %-25s |\n", "2. Remove Nurse");
            System.out.printf("| %-25s |\n", "3. Remove Lab Staff");
            System.out.printf("| %-25s |\n", "4. Back to Admin Menu");
            System.out.println("=============================");
            System.out.print("Enter your choice: ");

            int removeStaffChoice = getUserChoice();

            switch (removeStaffChoice) {
                case 1 -> {
                    // Remove Doctor
                    System.out.print("Enter Doctor ID to remove: ");
                    String doctorIdToRemove = scanner.next();
                    hospital.removeDoctor(doctorIdToRemove);
                }
                case 2 -> {
                    // Remove Nurse
                    System.out.print("Enter Nurse ID to remove: ");
                    String nurseIdToRemove = scanner.next();
                    hospital.removeNurse(nurseIdToRemove);
                }
                case 3 -> {
                    // Remove Lab Staff
                    System.out.print("Enter Lab Staff ID to remove: ");
                    String labStaffIdToRemove = scanner.next();
                    hospital.removeLabStaff(labStaffIdToRemove);
                }
                case 4 -> exitRemoveStaffMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewStaffInformationMenu() {
        boolean exitViewStaffMenu = false;
        while (!exitViewStaffMenu) {
            System.out.println("\n======= STAFF INFORMATION ========");
            System.out.printf("| %-30s |\n", "1. View Doctor Information");
            System.out.printf("| %-30s |\n", "2. View Nurse Information");
            System.out.printf("| %-30s |\n", "3. View Lab Staff Information");
            System.out.printf("| %-30s |\n", "4. Back to Admin Menu");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");

            int viewStaffByIdChoice = getUserChoice();

            switch (viewStaffByIdChoice) {
                case 1 -> {
                    System.out.print("Enter Doctor ID: ");
                    String doctorIdToView = scanner.next();
                    hospital.viewDoctorInformationById(doctorIdToView);
                }
                case 2 -> {
                    System.out.print("Enter Nurse ID: ");
                    String nurseIdToView = scanner.next();
                    hospital.viewNurseInformationById(nurseIdToView);
                }
                case 3 -> {
                    System.out.print("Enter Lab Staff ID: ");
                    String labStaffIdToView = scanner.next();
                    hospital.viewLabStaffInformationById(labStaffIdToView);
                }
                case 4 -> exitViewStaffMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void receptionistMenu() {
        boolean exitReceptionistMenu = false;
        while (!exitReceptionistMenu) {
            System.out.println("\n========== RECEPTIONIST MENU ==========");
            System.out.printf("| %-35s |\n", "1. Add Patient");
            System.out.printf("| %-35s |\n", "2. View Patient Information");
            System.out.printf("| %-35s |\n", "3. Assign Patient to Room");
            System.out.printf("| %-35s |\n", "4. Schedule Appointment");
            System.out.printf("| %-35s |\n", "5. View Appointment Information");
            System.out.printf("| %-35s |\n", "6. View Room Information");
            System.out.printf("| %-35s |\n", "7. Back to Role Selection");
            System.out.println("=======================================");
            System.out.print("Enter your choice: ");

            int receptionistChoice = getUserChoice();

            switch (receptionistChoice) {
                case 1 -> {
                    // Add Patient
                    System.out.print("Patient ID: ");
                    String patientId = scanner.next();
                    System.out.print("Name: ");
                    String patientName = scanner.next();
                    System.out.print("Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Gender: ");
                    String patientGender = scanner.next();
                    Patient patient = new Patient(patientId, patientName, patientAge, patientGender);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully!");
                }
                case 2 -> {
                    // View Patient Information
                    System.out.print("Enter Patient ID: ");
                    String patientIdToView = scanner.next();
                    hospital.viewPatientInformation(patientIdToView);
                }
                case 3 -> {
                    // Assign Patient to Room
                    System.out.print("Enter Patient ID: ");
                    String patientIdForRoomAssignment = scanner.next();
                    System.out.print("Enter Room Number: ");
                    String roomNumber = scanner.next();
                    Patient patientForRoomAssignment = hospital.findPatientById(patientIdForRoomAssignment);
                    Room room = hospital.findEmptyRoom();

                    if (patientForRoomAssignment != null && room != null) {
                        hospital.assignPatientToRoom(patientForRoomAssignment, room);
                        room.setOccupied(true); // Mark the room as occupied
                        room.setPatientId(patientIdForRoomAssignment); // Assign the patient to the room
                        System.out.println("Patient assigned to room " + room.getRoomNumber() + " successfully!");
                    } else if (room == null) {
                        System.out.println("No available rooms.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                }
                case 4 -> {
                    // Schedule Appointment
                    System.out.print("Patient ID: ");
                    String patientIdForAppointment = scanner.next();
                    System.out.print("Doctor ID: ");
                    String doctorIdForAppointment = scanner.next();
                    System.out.print("Date: ");
                    String appointmentDate = scanner.next();
                    Appointment appointment = new Appointment(patientIdForAppointment, doctorIdForAppointment, appointmentDate);
                    hospital.addAppointment(appointment);
                    System.out.println("Appointment scheduled successfully!");
                }
                case 5 -> {
                    System.out.print("Enter Patient ID: ");
                    String patientIdForAppointments = scanner.next();
                    hospital.viewAppointmentInformation(patientIdForAppointments);
                }
                case 6 -> hospital.viewRoomInformation();
                case 7 -> exitReceptionistMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void doctorMenu() {
        boolean exitDoctorMenu = false;
        while (!exitDoctorMenu) {
            System.out.println("\n========= DOCTOR MENU ==========");
            System.out.printf("| %-28s |\n", "1. Add Medical Record");
            System.out.printf("| %-28s |\n", "2. Back to Role Selection");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            int doctorChoice = getUserChoice();

            switch (doctorChoice) {
                case 1 -> {
                    System.out.print("Medical Record ID: ");
                    String medicalRecordId = scanner.next();
                    System.out.print("Patient ID: ");
                    String patientIdForMedicalRecord = scanner.next();
                    System.out.print("Diagnosis: ");
                    String diagnosis = scanner.next();
                    System.out.print("Treatment: ");
                    String treatment = scanner.next();

                    Patient medicalRecordPatient = hospital.findPatientById(patientIdForMedicalRecord);
                    if (medicalRecordPatient != null) {
                        MedicalRecord medicalRecord = new MedicalRecord(medicalRecordId, patientIdForMedicalRecord, diagnosis, treatment);
                        hospital.addMedicalRecord(medicalRecord);
                        medicalRecordPatient.addMedicalRecord(medicalRecord); // Add medical record to patient
                        System.out.println("Medical Record added successfully!");
                    } else {
                        System.out.println("Patient not found.");
                    }
                }
                case 2 -> exitDoctorMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void labStaffMenu() {
        boolean exitStaffMenu = false;
        while (!exitStaffMenu) {
            System.out.println("\n========= LAB STAFF MENU =========");
            System.out.printf("| %-30s |\n", "1. Add Lab Report");
            System.out.printf("| %-30s |\n", "2. View Lab Report Information");
            System.out.printf("| %-30s |\n", "3. Back to Role Selection");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");

            int staffChoice = getUserChoice();

            switch (staffChoice) {
                case 1 -> {
                    System.out.print("Lab Report ID: ");
                    String labReportId = scanner.next();
                    System.out.print("Patient ID: ");
                    String patientIdForLabReport = scanner.next();
                    System.out.print("Test Type: ");
                    String testType = scanner.next();
                    System.out.print("Result: ");
                    String result = scanner.next();

                    Patient labReportPatient = hospital.findPatientById(patientIdForLabReport);
                    if (labReportPatient != null) {
                        LabReport labReport = new LabReport(labReportId, patientIdForLabReport, testType, result);
                        hospital.addLabReport(labReport);
                        labReportPatient.addLabReport(labReport); // Add lab report to patient
                        System.out.println("Lab Report added successfully!");
                    } else {
                        System.out.println("Patient not found.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Lab Report ID: ");
                    String labReportIdToView = scanner.next();
                    LabReport labReport = hospital.findLabReportById(labReportIdToView);
                    if (labReport != null) {
                        labReport.displayInfo(); // Display lab report information
                    } else {
                        System.out.println("Lab Report not found.");
                    }
                }
                case 3 -> exitStaffMenu = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void exitProgram() {
        System.out.println("Thank you! Exiting the program.");
        scanner.close();
        System.exit(0);
    }
}
