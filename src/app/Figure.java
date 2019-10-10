package app;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/*
    This class contains key methods, all figures are inherited from it.
*/

abstract class Figure {
    List<String> color = Arrays.asList("white","black","yellow","green","blue","red");

    public String getColor(){
        return color.get(randNom());
    }

    public void draw() {
        System.out.print(this);
    }

    public int randNom(){
        return ThreadLocalRandom.current().nextInt(0, 5);
    }

    public int randArea(){
        Random random = new Random();
        int num = random.nextInt(100);
        return num;
    }

    public String toString(){
        return "Figure: "+this.getClass().getSimpleName()+", Color: "+getColor() + " ";
    }
}