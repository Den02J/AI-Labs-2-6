package Lab4;

public class Transport {

    public boolean hasWheels = true;
    public String typeOfTransport;

    public Boolean has(String string) {
        return string.equals("Wheels") || string.equals("Engine");
    }
}
