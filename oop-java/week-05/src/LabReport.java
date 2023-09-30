public class LabReport {
    private String reportId;
    private String patientId;
    private String testType;
    private String result;

    public LabReport(String reportId, String patientId, String testType, String result) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.testType = testType;
        this.result = result;
    }

    public void displayInfo() {
        System.out.println("Lab Report Information:");
        System.out.println("Report ID: " + reportId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Test Type: " + testType);
        System.out.println("Result: " + result);
    }
}
