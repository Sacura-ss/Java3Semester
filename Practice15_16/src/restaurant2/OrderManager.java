package restaurant2;

import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Object> orderHashMap = new HashMap<Integer, Object>();
    HashMap<String, Object> orderHashMap1 = new HashMap<String, Object>();

    public void add(Order o, int table) throws OrderAlreadyException {
        String str = String.join(",", o.getMenu());
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table);
        else orderHashMap.put(table, str);
    }
    public Object getOrder(int table){
        return orderHashMap.get(table);
    }

    public void add(Dish dish, int table) throws OrderAlreadyException{
        if (orderHashMap.containsKey(table))
            throw new OrderAlreadyException(table);
        else orderHashMap.put(table, dish);
    }
    public void removeOrder(int table){
        orderHashMap.remove(table);
    }
    public HashMap orders(){
        return orderHashMap;
    }



    public void add(Order o, String customer) {
        String str = String.join(",", o.getMenu());

        orderHashMap1.put(str, customer);
    }
    public Object getOrder(String address){
        return orderHashMap1.get(address);
    }
    public void removeOrderInternet(String address){
        orderHashMap1.remove(address);
    }
    public HashMap getInternetOrder(){
        return orderHashMap1;
    }

    public static final class Address {
        private final String cityName, streetName;
        private final int zipCode, buildNum, apartmentNum;
        private final char buildCorp;
        public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, 0);

        public Address(String cityName, int zipCode, String streetName, int buildNum, int apartmentNum, char buildCorp) {
            this.cityName = cityName;
            this.streetName = streetName;
            this.zipCode = zipCode;
            this.apartmentNum = apartmentNum;
            this.buildNum = buildNum;
            this.buildCorp = buildCorp;
        }
        public Address(String cityName,int zipCode, String streetName, int buildNum, int apartmentNum){
            this(cityName, zipCode, streetName, buildNum, apartmentNum, ' ');
        }

        public int getZipCode() {
            return zipCode;
        }

        public int getApartmentNum() {
            return apartmentNum;
        }

        public int getBuildNum() {
            return buildNum;
        }

        public String getCityName() {
            return cityName;
        }

        public String getStreetName() {
            return streetName;
        }
    }
}
