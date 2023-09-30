import java.util.ArrayList;
import java.util.List;

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

    public void addRoom(Room room) {
        rooms.add(room);
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

    public void assignPatientToRoom(Patient patient, Room room) {
        patient.assignRoom(room.getRoomNumber());
        room.assignPatient();
    }

    public void viewRoomInformation() {
        for (Room room : rooms) {
            room.displayInfo();
        }
    }

    public void viewDoctorInformation(String doctorId) {
        Doctor doctor = findDoctorById(doctorId);
        if (doctor != null) {
            doctor.displayInfo();
        } else {
            System.out.println("Doctor not found.");
        }
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
}
