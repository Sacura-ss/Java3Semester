package lab3;
class Plate extends Dish {
    private int radius;

    public Plate(String colour, String material, boolean pattern, int radius) {
        super(colour, material, pattern);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int clear() {
        System.out.println("Time:");
        return (2*radius);
    }
    public void Eat(){
        if(isFullness())
            System.out.println("Feel good");
        else
            System.out.println("No food in the plate");
    }

    @Override
    public String toString() {
        return super.toString() + "Plate{" +
                "radius=" + radius +
                '}';
    }
}
