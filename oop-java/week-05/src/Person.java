public class Person {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Person(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("==== Person Information ====");
        System.out.println("ID\t\t: " + id);
        System.out.println("Name\t: " + name);
        System.out.println("Age\t\t: " + age);
        System.out.println("Gender\t: " + gender);
    }
}
