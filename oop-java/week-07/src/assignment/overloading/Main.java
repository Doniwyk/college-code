package assignment.overloading;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int totalSudut = segitiga.totalSudut(60);
        System.out.println("The total angle of the triangle is: " + totalSudut);

        int keliling = segitiga.keliling(3, 4, 5);
        System.out.println("\nsisi A = 3, sisi B = 4, sisi C = 5");
        System.out.println("The perimeter of the triangle is: " + keliling);

        double kelilingRightTriangle = segitiga.keliling(5, 5);
        System.out.println("\nsisi A = 5, sisi B = 5");
        System.out.println("The perimeter of the right triangle is: " + kelilingRightTriangle);
    }
}

