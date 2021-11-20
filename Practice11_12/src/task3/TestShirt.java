package task3;

import java.util.StringTokenizer;

public class TestShirt {
    public static void main(String[] args) {

        String str = "S001,Black Polo Shirt,Black,XL; " +
                "S002,Black Polo Shirt,Black,L; " +
                "S003,Blue Polo Shirt,Blue,XL; " +
                "S004,Blue Polo Shirt,Blue,M; " +
                "S005,Tan Polo Shirt,Tan,XL; " +
                "S006,Black T-Shirt,Black,XL; " +
                "S007,White T-Shirt,White,XL; " +
                "S008,White T-Shirt,White,L; " +
                "S009,Green T-Shirt,Green,S; " +
                "S010,Orange T-Shirt,Orange,S; " +
                "S011,Maroon Polo Shirt,Maroon,S";
        String[] shirts = str.split(";");
        Shirt[] shirts1 = new Shirt[11];

        for(int i = 0; i < shirts.length; i++) {
            StringTokenizer strT = new StringTokenizer(shirts[i],",");
            shirts1[i] = new Shirt(strT.nextToken(),strT.nextToken(),strT.nextToken(),strT.nextToken());
        }

        for(int j = 0; j < shirts1.length; j++) {
            System.out.println(shirts1[j]);
        }

    }
}
