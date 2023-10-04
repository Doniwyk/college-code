public class Nurse extends Person {
    private String department;
    public Nurse(String id, String name, int age, String gender, String department) {
        super(id, name, age, gender);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
