public abstract class Client {
    protected String name;

    public Client(String name) {
        this.name = name;
    }

    protected void pay(Order order) {
        System.out.println(name + " is paying an order of " + order.getPrice());
    }
}