package Practice3.task4_5;

class MovableCircle implements Movable{
    private  int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }
}
