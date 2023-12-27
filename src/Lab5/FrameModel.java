package Lab5;

public class FrameModel {
    public static void main(String[] args) {

        Wall walls = new Wall(3, 25, "brick");
        Door door = new Door(2, 10, "Armored");
        Window windows = new Window("Latest", 1, 1);
        Furniture furniture = new Furniture("Top", 30);

        House house = new House(walls, door, windows, furniture);

        System.out.println(house);
        house.countSum();

    }
}
