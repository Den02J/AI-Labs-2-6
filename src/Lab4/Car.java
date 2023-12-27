package Lab4;

public class Car extends Transport{
    public String typeOfTransport = "Car";
    public String modelName;
    public String color;
    public String engine;

    public Car(String modelName, String color, String engine) {
        this.modelName = modelName;
        this.color = color;
        this.engine = engine;
    }

    public Car() {
    }

}
