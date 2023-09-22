package doni.classRelation.practice3;

public class MainPractice3 {
    public static void main(String[] args) {
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Employee assistant = new Employee("4567", "Patrick Star");
        Train train = new Train("Gaya Baru", "Business", machinist, assistant);
        System.out.println(train.info());
    }
}