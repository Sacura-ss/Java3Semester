package lab7;

public class In implements Comparable<In>{
    int num;

    public In(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int compareTo(In i2) {
        return num-i2.getNum();
    }

}
