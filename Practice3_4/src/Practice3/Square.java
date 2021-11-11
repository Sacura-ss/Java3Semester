package Practice3;

class Square extends Rectangle {
    public Square(){}
    public Square(double side) {
        length = side;
        width = side;
    }
    public Square(double side, String color, boolean filled) {
        length = side;
        width = side;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public  void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square{"+ "side=" + width +"}";
    }
}
