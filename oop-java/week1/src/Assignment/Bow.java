package Assignment;

public class Bow extends Weapon{
    private int arrows;
    private final String material;
    private final double drawWeight;

    public Bow(String type, double weight, double length, double damage, double durability, int arrows, String material, double drawWeight) {
        super(type, weight, length, damage, durability);
        this.arrows = arrows;
        this.material = material;
        this.drawWeight = drawWeight;
    }

    public void reload() {
        arrows = 30;
        System.out.println("-> Arrows in " + type + " quiver are reloaded <-");
    }

    public void aim() {
        if (equipped) {
            System.out.println("-> Aiming with " + type + "... <-");
        } else {
            System.out.println("-> Can't aim, bow unequipped <-");
        }
    }

    public void shot() {
        if (equipped) {
            if (arrows > 0) {
                System.out.println("-> Firing an arrow for " + damage + " damage! <-");
                arrows--;
                durability -= 0.1;
            } else {
                System.out.println("-> No arrows left! <-");
            }
        } else {
            System.out.println("-> Can't shot, bow unequipped <-");
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("| %-15s: %-15s |\n", "Arrows", arrows);
        System.out.printf("| %-15s: %-15.2f |\n", "Draw Weight", drawWeight);
        System.out.printf("| %-15s: %-15s |\n", "Sword material", material);
        System.out.println("====================================\n");
    }
}