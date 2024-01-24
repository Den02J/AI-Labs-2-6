package Lab4;

public class Motorcycle extends Transport {
    public String typeOfTransport = "Motorcycle";
    public Transport transport;

    public Motorcycle() {
        this.transport = new Transport();
    }

    public Boolean is(String string) {
        return string.equals("Transport") || string.equals("Motorcycle");
    }

    public Boolean has(String string) {
        return transport.has(string) || string.equals("Leg");
    }
}
