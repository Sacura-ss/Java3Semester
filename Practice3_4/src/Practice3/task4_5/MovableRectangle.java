package Practice3.task4_5;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft + "bottomRight" + bottomRight + '}';
    }

    public boolean checkSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed & topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public void moveUp() {
        if(checkSpeed()) {
            topLeft.y = topLeft.y + topLeft.ySpeed;
            bottomRight.y = bottomRight.y + bottomRight.ySpeed;
        }
    }

    @Override
    public void moveDown() {
        if(checkSpeed()) {
            topLeft.y = topLeft.y - topLeft.ySpeed;
            bottomRight.y = bottomRight.y - bottomRight.ySpeed;
        }
    }

    @Override
    public void moveLeft() {
        if(checkSpeed()) {
            topLeft.x = topLeft.x - topLeft.xSpeed;
            bottomRight.x = bottomRight.x - bottomRight.xSpeed;
        }
    }

    @Override
    public void moveRight() {
        if(checkSpeed()) {
            topLeft.x = topLeft.x + topLeft.xSpeed;
            bottomRight.x = bottomRight.x + bottomRight.xSpeed;
        }
    }
}
