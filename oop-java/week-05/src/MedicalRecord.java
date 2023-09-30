public class MedicalRecord {
    private String recordId;
    private String patientId;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(String recordId, String patientId, String diagnosis, String treatment) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public void displayInfo() {
        System.out.println("Medical Record Information:");
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
    }
}
