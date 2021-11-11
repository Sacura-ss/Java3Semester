package lab3;

public  abstract class Dish {
    private String colour;
    private String material;
    private boolean pattern;
    private boolean fullness = false;
    private boolean clear = true;

    public Dish(String colour, String material, boolean pattern) {
        this.colour = colour;
        this.material = material;
        this.pattern = pattern;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPattern(boolean pattern) {
        this.pattern = pattern;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isPattern() {
        return pattern;
    }

    public boolean isFullness() {
        return fullness;
    }

    public boolean isClear() {
        return clear;
    }

    public void fill(){
        if(!fullness)
            fullness = true;
    }
    public abstract int clear();

    @Override
    public String toString() {
        return "Dish{" +
                "colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                ", pattern=" + pattern +
                "}";
    }
}
