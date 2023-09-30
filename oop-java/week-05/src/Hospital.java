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
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
        labStaffMembers = new ArrayList<>();
        appointments = new ArrayList<>();
        rooms = new ArrayList<>();
        labReports = new ArrayList<>();
        medicalRecords = new ArrayList<>();

        // Initialize rooms
        rooms.add(new Room("101"));
        rooms.add(new Room("102"));
        rooms.add(new Room("103"));
        // Add more rooms as needed
    }

    public boolean removeDoctor(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                doctors.remove(doctor);
                return true;
            }
        }
        return false;
    }

    public boolean removeNurse(String nurseId) {
        for (Nurse nurse : nurses) {
            if (nurse.getId().equals(nurseId)) {
                nurses.remove(nurse);
                return true;
            }
        }
        return false;
    }

    public boolean removeLabStaff(String labStaffId) {
        for (LabStaff lab : labStaffMembers) {
            if (lab.getId().equals(labStaffId)) {
                labStaffMembers.remove(lab);
                return true;
            }
        }
        return false;
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