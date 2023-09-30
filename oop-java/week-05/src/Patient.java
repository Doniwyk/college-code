import java.util.*;

public class Patient extends Person{
    private List<MedicalRecord> medicalRecords;
    private List<LabReport> labReports;
    private String assignedRoom;

    public Patient(String id, String name, int age, String gender) {
        super(id, name, age, gender);
        medicalRecords = new ArrayList<>();
        labReports = new ArrayList<>();
        assignedRoom = "";
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }

    public void addLabReport(LabReport labReport) {
        labReports.add(labReport);
    }

    public void assignRoom(String roomNumber) {
        assignedRoom = roomNumber;
    }

    public String getAssignedRoom() {
        return assignedRoom;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Medical Records:");
        for (MedicalRecord record : medicalRecords) {
            record.displayInfo();
        }
        System.out.println("Lab Reports:");
        for (LabReport report : labReports) {
            report.displayInfo();
        }
        System.out.println("Assigned Room: " + assignedRoom);
    }
}
