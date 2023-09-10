package Assignment;

public class Food {
    private final String name;
    private final double weight, calories;
    private boolean isCooked;

    public Food(String name, double weight, int calories, boolean isCooked) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.isCooked = isCooked;
    }

    public void consume() {
        if (!isCooked) {
            System.out.println("-> you have been poisoned <-");
        } else {
            System.out.println("-> You have eaten " + name + ". It has " + calories + " calories <-");
        }
    }

    public void cook() {
        if (isCooked) {
            consume();
        } else {
            System.out.println("-> Cooking " + name + "... <-");
            isCooked = true;
        }
    }

    public String getStatus() {
        if (isCooked) {
            return "Cooked";
        } else
            return "Uncooked";
    }

    public void printInfo() {
        System.out.println("\n========= FOOD INFORMATION =========");
        System.out.printf("| %-15s: %-15s |\n", "Food name", name);
        System.out.printf("| %-15s: %-15s |\n", "Weight", weight + "gr");
        System.out.printf("| %-15s: %-15s |\n", "Calories", calories + "kkal");
        System.out.printf("| %-15s: %-15s |\n", "Status", getStatus());
        System.out.println("====================================\n");
    }
}
