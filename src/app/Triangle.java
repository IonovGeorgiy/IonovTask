package app;

/*
The <code>Triangle</code> contains  all the logic for the Triangle.
*/

class Triangle extends Figure{
    private double side = randArea();

    public double getArea() {
        return side;
    }

    public double sideLength() {
        return side * 2;
    }

    public String toString(){
        return super.toString()+" Area: "+getArea() + " Side length: " +sideLength();
    }
}