package Practice10;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractChairFactory factory = new ChairFactory();

        Chair chair1 = factory.createMagicChair();
        client.setChair(chair1);
        client.sit();

        Chair chair2 = factory.createFunctionalChair();
        client.setChair(chair2);
        client.sit();

        Chair chair3 = factory.createVictorianChair(40);
        client.setChair(chair3);
        client.sit();
    }
}
