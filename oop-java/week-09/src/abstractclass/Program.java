package abstractclass;

public class Program {
    public static void main(String[] args) {
        Cat kucingKampung = new Cat();
        Fish lumbaLumba = new Fish();

        People ani = new People("Ani");
        People budi = new People("Budi");

        ani.pet(kucingKampung);
        budi.pet(lumbaLumba);

        ani.takeAWalk();
        budi.takeAWalk();
    }
}
