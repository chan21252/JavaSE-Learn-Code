package unit10.entity;

/**
 * 商品实体类
 */
public class Goods {
    private String number;
    private String name;
    private double price;
    private int quantity;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "商品编码： " + number + " ，商品名称： " + name +
                " ，商品单价： " + price + " ，商品数量： " + quantity;
    }
}
