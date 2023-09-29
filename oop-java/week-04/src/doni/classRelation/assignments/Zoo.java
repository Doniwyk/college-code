package doni.classRelation.assignments;

public class Zoo {
    private Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    void takeCareOfAnimal() {
        System.out.println("Zoo is taking care of the animal.");
        animal.eat();
    }
}
