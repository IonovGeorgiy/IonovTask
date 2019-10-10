package app;

import java.util.Scanner;

/*
This class works with receiving / displaying data to the console.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of figures: ");
        int n=sc.nextInt();

        RandomFigureFactory randomFigureFactory = new RandomFigureFactory();
        for(int i = 1; i <= n; i++){
            randomFigureFactory.figureNext();
            System.out.println("");
        }
    }
}