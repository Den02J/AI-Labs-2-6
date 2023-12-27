package Lab5;

public class Window {
    public String type; //wooden, plastic
    public int height;
    public int width;
    public int price = 200;

    public Window(String type, int height, int width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    @Override
    public String toString() {
        return "Window{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
