package doni.classRelation.assignments;

public class Person {
    private Animal pet;

    public Person(Animal pet) {
        this.pet = pet;
    }

    void playWithPet() {
        System.out.println("Person is playing with the pet.");
        pet.eat();
    }
}
