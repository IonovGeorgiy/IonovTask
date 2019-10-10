package app;

/*
The <code>Trapeze</code> contains  all the logic for the Trapeze.
*/

public class Trapeze extends Figure{
    private double side = randArea();

    public double getArea() {
        return side;
    }

    public double sideQuantity() {
        return 4;
    }

    public String toString(){
        return super.toString()+" Area: "+getArea() + " Side quantity: " +sideQuantity();
    }
}
