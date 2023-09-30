public class Appointment {
    private String patientId;
    private String doctorId;
    private String date;

    public Appointment(String patientId, String doctorId, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    public String getPatientId() {
        return patientId;
    }

    public void displayInfo() {
        System.out.println("Appointment Information:");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Date: " + date);
    }
}
