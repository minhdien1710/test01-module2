package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private boolean description;

    public Product() {
    }

    public Product(int id, String name, int price, boolean description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDescription() {
        return description;
    }

    public void setDescription(boolean description) {
        this.description = description;
    }
    public String toString(){
        return "san pham " + getName()+"," + "ID la "+
                getId() +", co gia la "+getPrice()+
                ", tinh trang: "+ (isDescription()? "con hang":"het hang");
    }
}
