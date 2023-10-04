public class LabStaff extends Person {
    private String spesialization;
    public LabStaff(String id, String name, int age, String gender, String spesialization) {
        super(id, name, age, gender);
        this.spesialization = spesialization;
    }

    public String getSpesialization() {
        return spesialization;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("spesialization: " + spesialization);
    }
}
