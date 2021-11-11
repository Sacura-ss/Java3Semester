package Practice9;

public class Client {
    private String iD;//FIO
    private long INN; //код из 12 арабских цифр для физлицы, 10 для юрлица

    public Client() {}

    public Client(String iD, long INN) {
        this.iD = iD;
        this.INN = INN;
    }

    public String getiD() {
        return iD;
    }

    public long getINN() {
        return INN;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setINN(long INN) {
        this.INN = INN;
    }

    @Override
    public String toString() {
        return "Client{" +
                "iD=" + iD +
                ", INN=" + INN +
                '}';
    }
}
