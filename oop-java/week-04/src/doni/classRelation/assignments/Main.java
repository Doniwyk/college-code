package doni.classRelation.assignments;

public class Main {
    public static void main(String[] args) {
        // Demonstrating "is-a" relationship
        Animal dog = new Mammal();
        Bird eagle = new Bird();

        // Demonstrating "has-a" relationship
        Zoo zoo = new Zoo(dog);

        // Demonstrating "uses-a" relationship
        Animal cat = new Mammal();
        Person person = new Person(cat);

        dog.eat(); // Polymorphism - calls Mammal's eat()
        eagle.fly(); // Polymorphism - calls Bird's fly()

        zoo.takeCareOfAnimal();
        person.playWithPet();
    }
}
