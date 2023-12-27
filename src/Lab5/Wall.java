package Lab5;

public class Wall {
    public int height;
    public int width;
    public String material; //brick, wood, etc
    public int price = 1000;

    public Wall(int height, int width, String material) {
        this.height = height;
        this.width = width;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", width=" + width +
                ", material='" + material + '\'' +
                '}';
    }
}
