package lesson_7;

public class MainClass {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 16);
        Plate plate = new Plate(15);
        plate.info();
        cat.eat(plate);
        cat.eatCats(plate);
        plate.info();
    }
}