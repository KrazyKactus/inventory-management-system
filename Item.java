public class Item {
    private String name;
    private String description;
    private String quantity;
    private String price;

    public void Item() {
    }

    public void Item(String name, String description, String quantity, String price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
}
