package i.phone.java_jsp_servlet.entity;

public class Phone {
    private int id;
    private String name;
    private String Brand;
    private double price;
    private String Description;

    public Phone() {
    }

    public Phone(int id, String name, String brand, double price, String description) {
        this.id = id;
        this.name = name;
        Brand = brand;
        this.price = price;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
