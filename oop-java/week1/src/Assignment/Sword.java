package Assignment;

public class Sword extends Weapon{
    private double sharpness;
    private final String material;

    public Sword(String type, double weight, double length, double damage, double durability, double sharpness, String material) {
        super(type, weight, length, damage, durability);
        this.sharpness = sharpness;
        this.material = material;
    }

    public void slash() {
        if (equipped) {
            System.out.println("-> Slash with " + type + " for " + damage + " damage <-");
            sharpness -= 0.1;
            durability -= 0.1;
        } else {
            System.out.println("-> Can't slash, sword unequipped <-");
        }
    }

    public void block() {
        if (equipped) {
            System.out.println("-> Block the enemy attack <-");
        } else {
            System.out.println("-> Can't block with sword, sword unequipped <-");
        }
    }

    public void sharpen() {
        sharpness += 5;
        if (sharpness > 50) {
            sharpness = 50;
        }
        System.out.println("-> " + type + " is sharpened <-");
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("| %-15s: %-15.2f |\n", "Sharpness", sharpness);
        System.out.printf("| %-15s: %-15s |\n", "Sword material", material);
        System.out.println("====================================\n");
    }
}
