package Practice10;

public class VictorianChair implements Chair{

    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String sitDown() {
        return "you sat on Victorian Chair";
    }

    public int getAge() {
        return age;
    }

}
