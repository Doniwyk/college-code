package practice2;

public class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}

// 4.5 Terdapat method overriding pada method swim
// 4.6 Method overriding terjadi pada method swim pada class Piranha. Method swim pada class Piranha mengoverride method swim pada class Ikan. Method swim pada class Piranha memiliki output yang berbeda dengan method swim pada class Ikan. Method swim pada class Piranha memiliki output "Piranha bisa makan daging" sedangkan method swim pada class Ikan memiliki output "Ikan bisa berenang".
