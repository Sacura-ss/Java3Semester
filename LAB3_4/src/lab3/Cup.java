package lab3;

class Cup extends Dish{
    private boolean handle;

    public Cup(String colour, String material, boolean pattern,boolean handle) {
        super(colour,material,pattern);
        this.handle = handle;
    }

    public boolean isHandle() {
        return handle;
    }
    public int clear() {
        System.out.println("Time:");
        return (7);
    }
    public void Drink() {
        if(isFullness())
            System.out.println("Feel good");
        else
            System.out.println("No drink in the cup");
    }

    @Override
    public String toString() {
        return (super.toString()+ "Cup{" + "handle=" + handle +"}");
    }

}
