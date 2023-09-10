package Assignment;

public class Bandage {
    private final String type, material;
    private double size;
    private boolean sterile;

    public Bandage(String type, int size, String material, boolean sterile) {
        this.type = type;
        this.size = size;
        this.material = material;
        this.sterile = sterile;
    }

    public void apply() {
        System.out.println("-> You have applied a " + type + " bandage of size " + size + "cm <-");
    }

    public void checkSterility() {
        if (sterile) {
            System.out.println("-> The bandage is sterile <-");
        } else {
            System.out.println("-> The bandage is not sterile <-");
        }
    }

    public void changeSize(int newSize) {
        this.size = newSize;
        System.out.println("-> The bandage size has been changed to " + newSize + "cm <-");
    }

    public void printInfo() {
        System.out.println("\n========= BANDAGE INFORMATION =========");
        System.out.printf("| %-15s: %-18s |\n", "Bandage type", type);
        System.out.printf("| %-15s: %-18s |\n", "Size", size);
        System.out.printf("| %-15s: %-18s |\n", "Material", material);
        System.out.println("=======================================\n");
    }
}
