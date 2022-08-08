package model;

public class Product implements Comparable {
   private int id;
   private String name;
   private int price;
   private int quantity;
   private String describe;

    public Product() {
    }

    public Product(int id, String name, int price, int quantity, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", describe='" + describe + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = this.name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = this.quantity;
    }

    public String getDescribe(String describle) {
        return describe;
    }

    public void setDescribe() {
        this.describe = describe;
    }

    public static int compareTo(Product p1 ,Product p2) {
        return p1.getPrice() - p2.getPrice() ;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
