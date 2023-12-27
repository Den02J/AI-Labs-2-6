package Lab3;

public class Car {
    public Model model;
    public boolean isBroken;
    public boolean isStarted = false;

    public Car(Model model, boolean isBroken) {
        this.model = model;
        this.isBroken = isBroken;
    }

    public Car(Model model, boolean isBroken, boolean isStarted) {
        this.model = model;
        this.isBroken = isBroken;
        this.isStarted = isStarted;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void destroy() {
        isBroken = true;
        isStarted = false;
    }

    public void fix() {
        isBroken = false;
        isStarted = false;
        System.out.println(model.name + " is fixed.");
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void start() {
        if (!this.isBroken) {
            isStarted = true;
            System.out.println(this.model.name + " is started.");
        }
        else {
            System.out.println(this.model.name + " cannot be started, because it's broken.");
        }
    }

    public void turnOff() {
        if (!this.isBroken) {
            isStarted = false;
            System.out.println(model.name + " is turned off.");
        }

    }

    public void isAllowedToRace() {
        if (model.maxSpeed >= 200 && !isBroken) {
            System.out.println(model.name + " is allowed to Race.");
        }
        else if (model.maxSpeed < 200 && !isBroken) {
            System.out.println(model.name + " is not allowed to Race because of speed capability limitation.");
        }
        else {
            System.out.println(model.name + " is not allowed to Race because it's broken.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", isBroken=" + isBroken +
                ", isStarted=" + isStarted +
                '}';
    }
}
