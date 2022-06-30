package nl.han.aim.oose.dea.helpers;

public class Product {
    private String name;
    private int price;
    private ProductCategory category;

    public Product(String name, int price) {
        this(name, price, ProductCategory.GADGETS);
    }

    public Product(String name, int price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductCategory getCategory() { return category; }

}
