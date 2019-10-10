package app;

/*
The <code>Circle</code> contains  all the logic for the Circle.
*/

public class Circle extends Figure{
    private double side = randArea();

    public double getArea() {
        return side;
    }

    public double radius() {
        return side * 5;
    }

    public String toString(){
        return super.toString()+" Area: "+getArea() + " Radius: " +radius();
    }
}
