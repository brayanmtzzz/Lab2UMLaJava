public class IndividualClient extends Client {
    private String card;

    public IndividualClient(String name, String card) {
        super(name);
        this.card = card;
    }

    public void pay(Order order) {
        super.pay(order);
        System.out.println("Using individual card: " + card);
    }
}