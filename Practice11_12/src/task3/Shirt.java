package task3;

public class Shirt {
    private String ID;
    private String Name;
    private String color;
    private String size;

    public Shirt() {}

    public Shirt(String ID, String name, String color, String size) {
        this.ID = ID;
        Name = name;
        this.color = color;
        this.size = size;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
