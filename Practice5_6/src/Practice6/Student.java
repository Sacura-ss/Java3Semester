package Practice6;

public class Student {
    private int iD;

    public Student(int iD) {
        this.iD = iD;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "iD=" + iD;
    }
}
