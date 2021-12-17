package restaurant2;

public enum DrinkTypeEnum {
    BEER("Alcohol", "Beer"),
    VODKA("Alcohol", "Vodka"),
    WINE("Alcohol", "Wine"),
    BRANDY("Alcohol", "Brandy"),
    TEQUILA("Alcohol", "Tequila"),
    RUM("Alcohol", "Rum"),
    WHISKEY("Alcohol", "Whiskey"),
    LIQUOR("Alcohol", "Liquor"),
    JUICE("Non-alcohol", "Juice"),
    COFFEE("Non-alcohol", "Coffee"),
    TEA("Non-alcohol", "Tea"),
    MILK("Non-alcohol", "Milk"),
    WATER("Non-alcohol", "Water");

    String[] alco = {"BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR"};
    String type;
    String name;

    DrinkTypeEnum(String type, String name) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public static DrinkTypeEnum[] getAlcohol(){
        return new DrinkTypeEnum[] {BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY,
                LIQUOR};
    }
    public boolean isAlcohol(){
        for (String t: alco){
            if (type == t)
                return true;
        }return false;
    }
    public static DrinkTypeEnum[] getNonAlcohol(){
        return new DrinkTypeEnum[] {JUICE, COFFEE, TEA, MILK, WATER};
    }
}
