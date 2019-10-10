package app;

/*
The <code>Square</code> contains  all the logic for the Square.
*/

public class Square extends Figure{
    private double side = randArea();

    public double getArea() {
        return side;
    }

    public double numberOfCorners() {
        return 4;
    }

    public String toString(){
        return super.toString()+" Area: "+getArea() + " Number of corners: " +numberOfCorners();
    }
}
