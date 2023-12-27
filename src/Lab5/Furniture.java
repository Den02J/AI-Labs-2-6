package Lab5;

public class Furniture {
    public String quality;
    public int quantity;
    public int price = 20;

    public Furniture(String quality, int quantity) {
        this.quality = quality;
        this.quantity = quantity;
        this.price = quantity * price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "quality='" + quality + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
