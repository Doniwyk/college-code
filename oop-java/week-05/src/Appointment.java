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
        System.out.println("\n==== Appointment Information ====");
        System.out.printf("| %-26s |\n", "Patient ID\t: " + patientId);
        System.out.printf("| %-26s |\n", "Doctor ID\t\t: " + doctorId);
        System.out.printf("| %-22s |\n", "Date\t\t\t: " + date);
        System.out.println("=================================");
    }
}
