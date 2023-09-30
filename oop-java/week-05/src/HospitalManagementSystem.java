import java.util.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Admin");
            System.out.println("2. Receptionist");
            System.out.println("3. Doctor");
            System.out.println("4. Lab Staff");
            System.out.println("5. Exit");
            System.out.print("Your Role: ");
            int roleChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (roleChoice) {
                case 1:
                    // Admin Menu
                    while (true) {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Add Staff");
                        System.out.println("2. Remove Staff");
                        System.out.println("3. View Patient Information");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Your Choice: ");
                        int adminChoice = scanner.nextInt();
                        scanner.nextLine();  // Consume newline

                        switch (adminChoice) {
                            case 1:
                                System.out.println("\nAdd Staff:");
                                System.out.println("1. Doctor");
                                System.out.println("2. Nurse");
                                System.out.println("3. Lab Staff");
                                System.out.print("Select Staff Type: ");
                                int staffTypeChoice = scanner.nextInt();
                                scanner.nextLine();  // Consume newline

                                switch (staffTypeChoice) {
                                    case 1:
                                        // Add Doctor
                                        System.out.print("Enter Doctor ID: ");
                                        String doctorId = scanner.nextLine();
                                        System.out.print("Enter Doctor Name: ");
                                        String doctorName = scanner.nextLine();
                                        System.out.print("Enter Doctor Age: ");
                                        int doctorAge = scanner.nextInt();
                                        scanner.nextLine();  // Consume newline
                                        System.out.print("Enter Doctor Gender: ");
                                        String doctorGender = scanner.nextLine();
                                        System.out.print("Enter Doctor Specialization: ");
                                        String doctorSpecialization = scanner.nextLine();

                                        Doctor doctor = new Doctor(doctorId, doctorName, doctorAge, doctorGender, doctorSpecialization);
                                        hospital.addDoctor(doctor);
                                        System.out.println("Doctor added successfully!");
                                        break;

                                    case 2:
                                        // Add Nurse
                                        System.out.print("Enter Nurse ID: ");
                                        String nurseId = scanner.nextLine();
                                        System.out.print("Enter Nurse Name: ");
                                        String nurseName = scanner.nextLine();
                                        System.out.print("Enter Nurse Age: ");
                                        int nurseAge = scanner.nextInt();
                                        scanner.nextLine();  // Consume newline
                                        System.out.print("Enter Nurse Gender: ");
                                        String nurseGender = scanner.nextLine();

                                        Nurse nurse = new Nurse(nurseId, nurseName, nurseAge, nurseGender);
                                        hospital.addNurse(nurse);
                                        System.out.println("Nurse added successfully!");
                                        break;

                                    case 3:
                                        // Add Lab Staff
                                        System.out.print("Enter Lab Staff ID: ");
                                        String labStaffId = scanner.nextLine();
                                        System.out.print("Enter Lab Staff Name: ");
                                        String labStaffName = scanner.nextLine();
                                        System.out.print("Enter Lab Staff Age: ");
                                        int labStaffAge = scanner.nextInt();
                                        scanner.nextLine();  // Consume newline
                                        System.out.print("Enter Lab Staff Gender: ");
                                        String labStaffGender = scanner.nextLine();

                                        LabStaff labStaff = new LabStaff(labStaffId, labStaffName, labStaffAge, labStaffGender);
                                        hospital.addLabStaff(labStaff);
                                        System.out.println("Lab Staff added successfully!");
                                        break;

                                    default:
                                        System.out.println("Invalid choice.");
                                }
                                break;

                            case 2:
                                System.out.println("\nRemove Staff:");
                                System.out.println("1. Doctor");
                                System.out.println("2. Nurse");
                                System.out.println("3. Lab Staff");
                                System.out.print("Select Staff Type: ");
                                int removeStaffTypeChoice = scanner.nextInt();
                                scanner.nextLine();  // Consume newline

                                switch (removeStaffTypeChoice) {
                                    case 1:
                                        // Remove Doctor
                                        System.out.print("Enter Doctor ID to remove: ");
                                        String doctorIdToRemove = scanner.nextLine();
                                        if (hospital.removeDoctor(doctorIdToRemove)) {
                                            System.out.println("Doctor removed successfully!");
                                        } else {
                                            System.out.println("Doctor not found.");
                                        }
                                        break;

                                    case 2:
                                        // Remove Nurse
                                        System.out.print("Enter Nurse ID to remove: ");
                                        String nurseIdToRemove = scanner.nextLine();
                                        if (hospital.removeNurse(nurseIdToRemove)) {
                                            System.out.println("Nurse removed successfully!");
                                        } else {
                                            System.out.println("Nurse not found.");
                                        }
                                        break;

                                    case 3:
                                        // Remove Lab Staff
                                        System.out.print("Enter Lab Staff ID to remove: ");
                                        String labStaffIdToRemove = scanner.nextLine();
                                        if (hospital.removeLabStaff(labStaffIdToRemove)) {
                                            System.out.println("Lab Staff removed successfully!");
                                        } else {
                                            System.out.println("Lab Staff not found.");
                                        }
                                        break;

                                    default:
                                        System.out.println("Invalid choice.");
                                }
                                break;

                            case 3:
                                // View Patient Information
                                System.out.print("Enter Patient ID to view information: ");
                                String patientIdToView = scanner.nextLine();
                                Patient patient = hospital.findPatientById(patientIdToView);
                                if (patient != null) {
                                    patient.displayInfo();
                                } else {
                                    System.out.println("Patient not found.");
                                }
                                break;

                            case 4:
                                // Back to Main Menu
                                return;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }

                    // Handle other role-specific menus (Receptionist, Doctor, Lab Staff) in similar fashion...

                case 5:
                    System.out.println("Thank you! Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid role choice.");
            }
        }
    }
}
