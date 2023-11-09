package abstractclass;

public class People {
    private String name;
    private Animal pet;

    public People(String name) {
        this.name = name;
    }

    public void pet(Animal pet) {
        this.pet = pet;
    }

    public void takeAWalk() {
        System.out.println("Namaku " + this.name);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.pet.bergerak();
        System.out.println("-----------------------------------------");
    }

}
