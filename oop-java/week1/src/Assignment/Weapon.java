package Assignment;

public class Weapon {
    public final String type;
    public double weight, length;
    public double durability, damage;
    public boolean equipped;

    public Weapon(String type, double weight, double length, double damage, double durability) {
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.damage = damage;
        this.durability = durability;
        this.equipped = false;
    }

    public void equip() {
        equipped = true;
        System.out.println("-> " + type + " is equipped <-");
    }

    public void unequip() {
        equipped = false;
        System.out.println("-> " + type + " is unequipped <-");
    }

    public void repair() {
        durability += 10;
        if (durability > 100) {
            durability = 100;
        }
        System.out.println("-> " + type + " is repaired <-");
    }

    public void printInfo() {
        System.out.println("\n======== WEAPON INFORMATION ========");
        System.out.printf("| %-15s: %-15s |\n", "Weapon type", type);
        System.out.printf("| %-15s: %-15.2f |\n", "Weight", weight);
        System.out.printf("| %-15s: %-15.2f |\n", "Length", length);
        System.out.printf("| %-15s: %-15.2f |\n", "Damage", damage);
        System.out.printf("| %-15s: %-15.2f |\n", "Durability", durability);
    }
}
