public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer user1 = new MobileApp("Alice");
        Observer user2 = new WebApp("Bob");

        market.register(user1);
        market.register(user2);

        market.setStock("TCS", 3550.75);
        market.setStock("INFY", 1499.60);
    }
}
