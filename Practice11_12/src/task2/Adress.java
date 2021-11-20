package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String housing;
    private String apartment;

    public Adress(String address, String d) {
        try {
            String[] str = address.split(d);
            country = str[0].trim();
            region = str[1].trim();
            town = str[2].trim();
            street = str[3].trim();
            house = str[4].trim();
            housing = str[5].trim();
            apartment = str[6].trim();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Adress(String address) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string of delim");
        String delim = "";
        try {
            delim = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringTokenizer strT = new StringTokenizer(address,delim); //true - чтоб работало когда есть пропуске в строке
        country = strT.nextToken();
        region = strT.nextToken();
        town = strT.nextToken();
        street = strT.nextToken();
        house = strT.nextToken();
        housing = strT.nextToken();
        apartment = strT.nextToken();
    }
    public String getAddress() {
        return country + " " + region + " " + town + " " + street + " " + house + " " + housing + " " + apartment;
    }
}
