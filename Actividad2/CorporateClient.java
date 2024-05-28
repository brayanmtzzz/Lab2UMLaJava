public class CorporateClient extends Client {
    private String account;

    public CorporateClient(String name, String account) {
        super(name);
        this.account = account;
    }

    public void pay(Order order) {
        super.pay(order);
        System.out.println("Using corporate account: " + account);
    }
}