package Lab4;

public class SemanticModel {
    public static void main(String[] args) {

        Owner owner = new Owner(
                "River Orange",
                new Car(
                    "Toyota Supra",
                    "Black",
                    "v6")
        );

        System.out.println("Type of transport: " + owner.transport.typeOfTransport);
        System.out.println("Model: " + owner.transport.modelName);
        System.out.println("Engine: " + owner.transport.engine);
        System.out.println("Color: " + owner.transport.color);
        System.out.println("Transport of '" + owner.fullName + "' is working? : " + owner.transport.isWorking);

    }
}
