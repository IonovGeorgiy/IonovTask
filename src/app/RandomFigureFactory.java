package app;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFigureFactory extends Figure{
    public int randNom(){
        return ThreadLocalRandom.current().nextInt(0, 4);
    }

/*
    Method figureNext selects a random figure.
*/

    public void figureNext() {
        int n=randNom();

        switch(n) {
            case 0:
                Triangle triangle = new Triangle();
                triangle.draw();
                System.out.println(n);
                break;
            case 1:
                Trapeze trapeze = new Trapeze();
                trapeze.draw();
                System.out.println(n);
                break;
            case 2:
                Circle circle = new Circle();
                circle.draw();
                System.out.println(n);
                break;
            case 3:
                Square square = new Square();
                square.draw();
                System.out.println(n);
                break;
            }
        }
    }


