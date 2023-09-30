import java.util.Scanner;

public class HospitalSystemManagement {
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
            System.out.println("9. Add Nurse");
            System.out.println("10. Add Lab Report");
            System.out.println("11. Add Medical Record");
            System.out.println("12. Add Lab Staff");
            System.out.println("13. Exit");
            System.out.print("Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
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
                    scanner.nextLine();  // Consume newline
                    System.out.print("Gender: ");
                    String doctorGender = scanner.nextLine();
                    System.out.print("Specialization: ");
                    String doctorSpecialization = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorId, doctorName, doctorAge, doctorGender, doctorSpecialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully!");
                    break;

                case 3:
                    System.out.print("Patient ID: ");
                    String patientIdForAppointment = scanner.nextLine();
                    System.out.print("Doctor ID: ");
                    String doctorIdForAppointment = scanner.nextLine();
                    System.out.print("Date: ");
                    String appointmentDate = scanner.nextLine();
                    Appointment appointment = new Appointment(patientIdForAppointment, doctorIdForAppointment, appointmentDate);
                    hospital.addAppointment(appointment);
                    System.out.println("Appointment scheduled successfully!");
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    String patientIdToView = scanner.nextLine();
                    hospital.viewPatientInformation(patientIdToView);
                    break;

                case 5:
                    System.out.print("Enter Doctor ID: ");
                    String doctorIdToView = scanner.nextLine();
                    hospital.viewDoctorInformation(doctorIdToView);
                    break;

                case 6:
                    System.out.print("Enter Patient ID: ");
                    String patientIdForAppointments = scanner.nextLine();
                    hospital.viewAppointmentInformation(patientIdForAppointments);
                    break;

                case 7:
                    hospital.viewRoomInformation();
                    break;

                case 8:
                    System.out.print("Enter Patient ID: ");
                    String patientIdForRoomAssignment = scanner.nextLine();
                    System.out.print("Enter Room Number: ");
                    String roomNumber = scanner.nextLine();
                    Patient patientForRoomAssignment = hospital.findPatientById(patientIdForRoomAssignment);
                    Room room = hospital.findEmptyRoom();

                    if (patientForRoomAssignment != null && room != null) {
                        hospital.assignPatientToRoom(patientForRoomAssignment, room);
                        System.out.println("Patient assigned to room " + room.getRoomNumber() + " successfully!");
                    } else if (room == null) {
                        System.out.println("No available rooms.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 9:
                    System.out.print("Nurse ID: ");
                    String nurseId = scanner.nextLine();
                    System.out.print("Name: ");
                    String nurseName = scanner.nextLine();
                    System.out.print("Age: ");
                    int nurseAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Gender: ");
                    String nurseGender = scanner.nextLine();
                    Nurse nurse = new Nurse(nurseId, nurseName, nurseAge, nurseGender);
                    hospital.addNurse(nurse);
                    System.out.println("Nurse added successfully!");
                    break;

                case 10:
                    System.out.print("Lab Report ID: ");
                    String labReportId = scanner.nextLine();
                    System.out.print("Patient ID: ");
                    String patientIdForLabReport = scanner.nextLine();
                    System.out.print("Test Type: ");
                    String testType = scanner.nextLine();
                    System.out.print("Result: ");
                    String result = scanner.nextLine();

                    Patient labReportPatient = hospital.findPatientById(patientIdForLabReport);
                    if (labReportPatient != null) {
                        LabReport labReport = new LabReport(labReportId, patientIdForLabReport, testType, result);
                        hospital.addLabReport(labReport);
                        labReportPatient.addLabReport(labReport); // Add lab report to patient
                        System.out.println("Lab Report added successfully!");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 11:
                    System.out.print("Medical Record ID: ");
                    String medicalRecordId = scanner.nextLine();
                    System.out.print("Patient ID: ");
                    String patientIdForMedicalRecord = scanner.nextLine();
                    System.out.print("Diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    System.out.print("Treatment: ");
                    String treatment = scanner.nextLine();

                    Patient medicalRecordPatient = hospital.findPatientById(patientIdForMedicalRecord);
                    if (medicalRecordPatient != null) {
                        MedicalRecord medicalRecord = new MedicalRecord(medicalRecordId, patientIdForMedicalRecord, diagnosis, treatment);
                        hospital.addMedicalRecord(medicalRecord);
                        medicalRecordPatient.addMedicalRecord(medicalRecord); // Add medical record to patient
                        System.out.println("Medical Record added successfully!");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 12:
                    System.out.print("Lab Staff ID: ");
                    String labStaffId = scanner.nextLine();
                    System.out.print("Name: ");
                    String labStaffName = scanner.nextLine();
                    System.out.print("Age: ");
                    int labStaffAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Gender: ");
                    String labStaffGender = scanner.nextLine();
                    LabStaff staff = new LabStaff(labStaffId, labStaffName, labStaffAge, labStaffGender);
                    hospital.addLabStaff(staff);
                    System.out.println("Lab Staff added successfully!");
                    break;

                case 13:
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
