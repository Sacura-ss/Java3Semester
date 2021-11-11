package Practice10;

public class MagicChair implements Chair{

    public MagicChair() {
    }

    @Override
    public String sitDown() {
        return "you sat on a Magic Chair";
    }

    public void doMagic(){
        System.out.println("Boooo");
    }
}
