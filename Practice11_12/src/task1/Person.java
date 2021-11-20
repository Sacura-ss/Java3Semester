package task1;

public class Person {
    String F; //ФИО))
    String I;
    String O;

    public Person(String f, String i, String o) {
        F = f;
        I = i;
        O = o;
    }

    public String getFIO() {
        if(I.isEmpty() && O.isEmpty()) return F;
        else if (I.isEmpty()) return F + " " + O;
        else if (O.isEmpty()) return F + " " + I;
        else return F + " " + I + " " + O +" ";
    }
}
