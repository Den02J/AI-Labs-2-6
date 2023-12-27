package Lab5;

public class Door {
    public int height;
    public int width;
    public String type; //heavy, armored, enhanced lock system, etc
    public int price = 300;

    public Door(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Door{" +
                "height=" + height +
                ", width=" + width +
                ", type='" + type + '\'' +
                '}';
    }
}
