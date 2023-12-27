package Lab3;

public class ProductionModel {
    public static void main(String[] args) {

        Model Dacia = new Model("Dacia", 140);
        Model Porshe = new Model("Porshe", 250);

        Car car1 = new Car(Dacia, true);
        Car car2 = new Car(Porshe, false);

        System.out.println(car1.isStarted);
        car1.start();
        System.out.println(car1.isStarted);

        System.out.println();

        System.out.println(car2.isStarted);
        car2.start();
        System.out.println(car2.isStarted);

        car1.isAllowedToRace();
        car1.fix();
        car1.isAllowedToRace();
        car2.isAllowedToRace();
    }
}
