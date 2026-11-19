public class Item {
    private String name;
    private String description;
    private String quantity;
    private String price;

    public Item() {
    }

    public Item(String name, String description, String quantity, String price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void SetQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void SetPrice(String price) {
        this.price = price;
    }

    public String GetName() {
        return this.name;
    }

    public String GetDescription() {
        return this.description;
    }

    public String GetQuantity() {
        return this.quantity;
    }

    public String GetPrice() {
        return this.price;
    }
}
