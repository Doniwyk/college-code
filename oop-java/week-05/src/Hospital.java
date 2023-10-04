import java.util.*;

public class Hospital {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;
    private List<Room> rooms;
    private List<Nurse> nurses;
    private List<LabReport> labReports;
    private List<MedicalRecord> medicalRecords;
    private List<LabStaff> labStaff;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
        rooms = new ArrayList<>();
        nurses = new ArrayList<>();
        labReports = new ArrayList<>();
        medicalRecords = new ArrayList<>();
        labStaff = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        int numberOfRooms = 10;

        for (int i = 1; i <= numberOfRooms; i++) {
            String roomNumber = String.format("%03d", i);
            rooms.add(new Room(roomNumber));
        }
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void addLabReport(LabReport labReport) {
        labReports.add(labReport);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }

    public void addLabStaff(LabStaff staff) {
        labStaff.add(staff);
    }

    public Room findEmptyRoom() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return room;
            }
        }
        return null;
    }

    public Patient findPatientById(String patientId) {
        for (Patient patient : patients) {
            if (patient.getId().equals(patientId)) {
                return patient;
            }
        }
        return null;
    }

    public Doctor findDoctorById(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                return doctor;
            }
        }
        return null;
    }

    public Nurse findNurseById(String doctorId) {
        for (Nurse nurse : nurses) {
            if (nurse.getId().equals(doctorId)) {
                return nurse;
            }
        }
        return null;
    }

    public LabStaff findLabStaffById(String labStaffId) {
        for (LabStaff staff : labStaff) {
            if (staff.getId().equals(labStaffId)) {
                return staff;
            }
        }
        return null;
    }

    public LabReport findLabReportById(String labReportId) {
        for (LabReport labReport : labReports) {
            if (labReport.getReportId().equals(labReportId)) {
                return labReport;
            }
        }
        return null;
    }

    public void assignPatientToRoom(Patient patient, Room room) {
        patient.assignRoom(room.getRoomNumber());
        room.assignPatient();
    }

    public void viewRoomInformation() {
        int columns = 2;
        int maxRoomNumberLength = 3;
        int maxStatusLength = "Occupied: Yes".length(); // Assuming "Occupied: Yes/No" is the longest status string

        System.out.println("\n===================================== ROOM INFORMATION =====================================");
        for (int i = 0; i < rooms.size(); i += columns) {
            for (int j = 0; j < columns; j++) {
                int index = i + j;
                if (index < rooms.size()) {
                    Room room = rooms.get(index);
                    String roomInfo = String.format("| Room Number: %-" + maxRoomNumberLength + "s | Occupied: %-" + maxStatusLength + "s |", room.getRoomNumber(), room.isOccupied() ? "Yes" : "No");
                    System.out.print(roomInfo);
                }
            }
            System.out.println();
        }
        System.out.println("============================================================================================");
    }

    public void viewPatientInformation(String patientId) {
        Patient patient = findPatientById(patientId);
        if (patient != null) {
            patient.displayInfo();
        } else {
            System.out.println("Patient not found.");
        }
    }

    public void viewAppointmentInformation(String patientId) {
        for (Appointment appointment : appointments) {
            if (appointment.getPatientId().equals(patientId)) {
                appointment.displayInfo();
            }
        }
    }

    public void removeDoctor(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                doctors.remove(doctor);
                System.out.println("Doctor removed successfully.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    public void removeNurse(String nurseId) {
        for (Nurse nurse : nurses) {
            if (nurse.getId().equals(nurseId)) {
                nurses.remove(nurse);
                System.out.println("Nurse removed successfully.");
                return;
            }
        }
        System.out.println("Nurse not found.");
    }

    public void removeLabStaff(String labStaffId) {
        for (LabStaff staff : labStaff) {
            if (staff.getId().equals(labStaffId)) {
                labStaff.remove(staff);
                System.out.println("Lab Staff removed successfully.");
                return;
            }
        }
        System.out.println("Lab Staff not found.");
    }
    public void viewDoctorInformationById(String doctorId) {
        Doctor doctor = findDoctorById(doctorId);
        if (doctor != null) {
            doctor.displayInfo();
        } else {
            System.out.println("Doctor not found.");
        }
    }

    public void viewNurseInformationById(String nurseId) {
        Nurse nurse = findNurseById(nurseId);
        if (nurse != null) {
            nurse.displayInfo();
        } else {
            System.out.println("Nurse not found.");
        }
    }

    public void viewLabStaffInformationById(String labStaffId) {
        LabStaff staff = findLabStaffById(labStaffId);
        if (staff != null) {
            staff.displayInfo();
        } else {
            System.out.println("Lab Staff not found.");
        }
    }
}
