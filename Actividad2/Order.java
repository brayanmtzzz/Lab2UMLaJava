public class Order {
    private int price;
    private String date;

    public Order(String date, int price) {
        this.date = date;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}