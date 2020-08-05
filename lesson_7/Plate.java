package lesson_7;

public class Plate  {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food > n){
            System.out.println("A Cat Barsik has eaten, hi is full");
        }food -= n;
        while (food < 0){
            System.out.println("Not enough food");
            System.out.println("A Cat Barsik stayed hungry((");
            food += n;
            break;
        }
    }
    public int plateFood(int plate) {
        return plate + 5;
    }

    public void plate(int satiety, int[] cats, int appetite) {

        int plate = food;
        cats[0] = satiety;
        cats[1] = satiety + 5 ;
        cats[2] = satiety + 10;

        System.out.println("\n=====================================================");
        System.out.println("Food left after Barsik = " + food);
        System.out.println("=====================================================");

        do{
            if (plate >= cats[0]) {
                System.out.println("\nA Cat Pushok has eaten, hi is full");
                break;
            }
            while (plate < satiety) {
                String catPushok = "\nA Cat Pushok  satiety " + (cats[0] - plate);
                System.out.println(catPushok);
                System.out.println("Add some food to the plate, we don't know how hungry Cat Pushok");
                plate = plateFood(plate);
            }
            System.out.println("\nNow a Cat Pushok has eaten, hi is full");
            break;
        }while (plate >= cats[0]);

            plate -= cats[0];

        System.out.println("\n=====================================================");
        System.out.println("Food left after Pushok = " + plate);
        System.out.println("=====================================================");

        do{
            if (plate >= cats[1]) {
                System.out.println("\nA Cat Snowball has eaten, hi is full");
                break;
            }

            while (plate < cats[1]) {
                String catSnowball = "\nA Cat Snowball  satiety " + (cats[1] - plate);
                System.out.println(catSnowball);
                System.out.println("Add some food to the plate, we don't know how hungry Cat Snowball");
                plate = plateFood(plate);
            }
            System.out.println("\nNow a Cat Snowball has eaten, hi is full");
            break;
        }while (plate >= cats[1]);

            plate -= cats[1];

        System.out.println("\n=====================================================");
        System.out.println("Food left after Snowball = " + plate);
        System.out.println("=====================================================");

        do{
            if (plate >= cats[2]) {
                System.out.println("\nA Cat Smoke has eaten, hi is full");
                break;
            }
            while (plate < cats[2]) {
                String catSmoke = "\nA Cat Smoke  satiety " + (cats[2] - plate);
                System.out.println(catSmoke);
                System.out.println("Add some food to the plate, we don't know how hungry Cat Smoke");
                plate = plateFood(plate);
            }
            System.out.println("\nNow a Cat Smoke has eaten, hi is full");
            break;

        }while (plate >= cats[2]);
        food = plate;
    }

    public void info() {
        System.out.println("\n=====================================================");
        System.out.println("Leftover food " + food);
        System.out.println("=====================================================");
    }

}
