package practice2;

public class Perkalian {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

//    void perkalian(int a, int b, int c) {
//        System.out.println(a * b * c);
//    }
    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Perkalian obj = new Perkalian();
        obj.perkalian(25, 43);
//        obj.perkalian(34, 23, 56);
        obj.perkalian(34.56, 23.7);
    }

    //4.1 Terdapat method overloading pada method perkalia
    // 4.2 Parameter yang berbeda ialah int c, dimana pada function perkalian yang pertama memiliki paramter a dan b. Sedangan pada method kedua memiliki tambahan parameter c

    //4.3 Terdapat method overloading pada method perkalian
    //4.4 Parameter yang berbeda ialah tipe data dari parameter a dan b, dimana pada function perkalian yang pertama memiliki paramter a dan b dengan tipe data int. Sedangan pada method kedua memiliki parameter a dan b dengan tipe data double
}
