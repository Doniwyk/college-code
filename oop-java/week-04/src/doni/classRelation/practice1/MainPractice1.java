package doni.classRelation.practice1;

public class MainPractice1 {
    public static void main(String[] args) {
        Processor proc = new Processor("Intel i5", 3);
//        Laptop laptop = new Laptop("Thinkpad", proc);
        Laptop laptop = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        laptop.info();

        Processor proc2 = new Processor();
        proc2.setMerk("Intel i5");
        proc2.setCache(4);

        Laptop laptop2 = new Laptop();
        laptop2.setMerk("Thinkpad");
        laptop2.setProc(proc2);

        laptop2.info();
    }
}