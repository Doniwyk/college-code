import java.util.*;
class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;
    private List<Room> rooms;
    private List<Nurse> nurses;
    private List<LabReport> labReports;
    private List<MedicalRecord> medicalRecords;
    private List<LabStaff> labStaffMembers;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.nurses = new ArrayList<>();
        this.labReports = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
        this.labStaffMembers = new ArrayList<>();

        // Initialize rooms
        rooms.add(new Room("101"));
        rooms.add(new Room("102"));
        rooms.add(new Room("103"));
        // Add more rooms as needed
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room findEmptyRoom() {
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                return room;
            }
        }
        return null;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
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

    public void addLabStaff(LabStaff labStaff) {
        labStaffMembers.add(labStaff);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Doctor findDoctorById(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                return doctor;
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
}