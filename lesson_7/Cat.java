package lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private int satiety = 14;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    public void eatCats(Plate e) {
        int[] cats = new int[3];
            e.plate(satiety, cats,appetite);
    }
}
