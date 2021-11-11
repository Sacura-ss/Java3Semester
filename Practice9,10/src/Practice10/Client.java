package Practice10;

public class Client {

    private Chair chair;

    public Client() {}

    public void sit() {
        System.out.println(chair.sitDown());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
