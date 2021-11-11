package Practice10;

public class FunctionalChair implements Chair {

    public FunctionalChair() {
    }

    @Override
    public String sitDown() {
        return "you sat on a Functional Chair";
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
