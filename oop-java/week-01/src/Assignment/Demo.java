package Assignment;

public class Demo {
    public static void main(String[] args) {
        Sword greatSword = new Sword("Great Sword", 4.5, 1.55, 30, 100, 50, "Steel");
        greatSword.printInfo();

        greatSword.equip();
        greatSword.slash();
        greatSword.slash();
        greatSword.block();
        greatSword.unequip();
        greatSword.slash();
        greatSword.block();
        greatSword.printInfo();
        greatSword.repair();
        greatSword.printInfo();
        greatSword.sharpen();
        greatSword.printInfo();

        Bow longBow = new Bow("Long Bow", 2.0, 3.0, 20, 150, 30, "Red Wood", 70);
        longBow.printInfo();
        longBow.equip();
        longBow.aim();
        longBow.shot();
        longBow.printInfo();
        longBow.shot();
        longBow.shot();
        longBow.reload();
        longBow.printInfo();
        longBow.repair();
        longBow.printInfo();

        Food fish = new Food("Fish", 150.0, 95, false);
        fish.consume();
        fish.printInfo();
        fish.cook();
        fish.printInfo();

        Bandage adhesiveBandage = new Bandage("Adhesive Bandage", 5, "Fabric", true);
        adhesiveBandage.apply();
        adhesiveBandage.checkSterility();
        adhesiveBandage.changeSize(7);
        adhesiveBandage.printInfo();
    }
}
