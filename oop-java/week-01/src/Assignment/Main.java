package Assignment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sword greatSword = new Sword("Great Sword", 4.5, 1.55, 30, 100, 50, "Steel");
        Bow longBow = new Bow("Long Bow", 2.0, 3.0, 20, 150, 30, "Red Wood", 70);
        Food fish = new Food("Fish", 150.0, 95, false);
        Bandage adhesiveBandage = new Bandage("Adhesive Bandage", 5, "Fabric", true);

        while (true) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.printf("| %-13s %-13s |\n", "1. Weapon", "3. Bandage");
            System.out.printf("| %-13s %-13s |\n", "2. Raw Fish", "4. Back");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");

            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1 -> weaponMenu(scanner, greatSword, longBow);
                case 2 -> foodMenu(scanner, fish);
                case 3 -> bandageMenu(scanner, adhesiveBandage);
                case 4 -> {
                    System.out.println("Exiting the program.");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void weaponMenu(Scanner scanner, Sword greatSword, Bow longBow) {
        while (true) {
            System.out.println("\n==== WEAPON ====");
            System.out.println("1. Great Sword");
            System.out.println("2. Long Bow");
            System.out.println("3. Back");
            System.out.print("Enter your choice: ");

            int weaponChoice = scanner.nextInt();

            switch (weaponChoice) {
                case 1 -> greatSwordMenu(scanner, greatSword);
                case 2 -> longBowMenu(scanner, longBow);
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void greatSwordMenu(Scanner scanner, Sword greatSword) {
        while (true) {
            System.out.println("\n=========== SWORD MENU ============");
            System.out.printf("| %-15s %-15s |\n", "1. Equip", "5. Repair");
            System.out.printf("| %-15s %-15s |\n", "2. Unequip", "6. Sharpen");
            System.out.printf("| %-15s %-15s |\n", "3. Slash", "7. Sword Info");
            System.out.printf("| %-15s %-15s |\n", "4. Block", "8. Back");
            System.out.println("===================================");
            System.out.print("Enter your choice: ");

            int greatSwordChoice = scanner.nextInt();

            switch (greatSwordChoice) {
                case 1 -> greatSword.equip();
                case 2 -> greatSword.unequip();
                case 3 -> greatSword.slash();
                case 4 -> greatSword.block();
                case 5 -> greatSword.repair();
                case 6 -> greatSword.sharpen();
                case 7 -> greatSword.printInfo();
                case 8 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void longBowMenu(Scanner scanner, Bow longBow) {
        while (true) {
            System.out.println("\n=========== BOW MENU ============");
            System.out.printf("| %-15s %-15s |\n", "1. Equip", "5. Reload");
            System.out.printf("| %-15s %-15s |\n", "2. Unequip", "6. Repair");
            System.out.printf("| %-15s %-15s |\n", "3. Aim", "7. Bow Info");
            System.out.printf("| %-15s %-15s |\n", "4. Shot", "8. Back");
            System.out.println("===================================");
            System.out.print("Enter your choice: ");

            int longBowChoice = scanner.nextInt();

            switch (longBowChoice) {
                case 1 -> longBow.equip();
                case 2 -> longBow.unequip();
                case 3 -> longBow.aim();
                case 4 -> longBow.shot();
                case 5 -> longBow.reload();
                case 6 -> longBow.repair();
                case 7 -> longBow.printInfo();
                case 8 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void foodMenu(Scanner scanner, Food fish) {
        while (true) {
            System.out.println("\nFood Menu:");
            System.out.println("1. Consume");
            System.out.println("2. Cook");
            System.out.println("3. Back");
            System.out.print("Enter your choice: ");

            int foodChoice = scanner.nextInt();

            switch (foodChoice) {
                case 1 -> fish.consume();
                case 2 -> fish.cook();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void bandageMenu(Scanner scanner, Bandage adhesiveBandage) {
        while (true) {
            System.out.println("\nBandage Menu:");
            System.out.println("1. Apply");
            System.out.println("2. Check Sterility");
            System.out.println("3. Change Size");
            System.out.println("4. Back");
            System.out.print("Enter your choice: ");

            int bandageChoice = scanner.nextInt();

            switch (bandageChoice) {
                case 1 -> adhesiveBandage.apply();
                case 2 -> adhesiveBandage.checkSterility();
                case 3 -> {
                    System.out.print("Enter new size (in cm): ");
                    int newSize = scanner.nextInt();
                    adhesiveBandage.changeSize(newSize);
                }
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
