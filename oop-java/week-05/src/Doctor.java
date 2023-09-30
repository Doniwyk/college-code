public class Doctor extends Person{
    private final String specialization;

    public Doctor(String id, String name, int age, String gender, String specialization) {
        super(id, name, age, gender);
        this.specialization = specialization;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
