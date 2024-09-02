package edu.ithaca.dragon.shapes;

import javax.sound.midi.Receiver;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){

        Rectangle rectangle_01 = new Rectangle(Math.random() * 10, Math.random() * 10);
        Rectangle rectangle_02 = new Rectangle(Math.random() * 10, Math.random() * 10);
        Rectangle rectangle_03 = new Rectangle(Math.random() * 10, Math.random() * 10);
        Rectangle rectangle_04 = new Rectangle(Math.random() * 10, Math.random() * 10);
        Rectangle rectangle_05 = new Rectangle(Math.random() * 10, Math.random() * 10);


        for (int i = 0; i < 5; i++) {
            //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
            //Allow the user to choose one, double the size of that one, and print them all again
            //Use a loop to repeat the process 5 times
            System.out.println(rectangle_01.calcArea());
            System.out.println(rectangle_01.longestLineWithin());
            System.out.println("");

            System.out.println(rectangle_02.calcArea());
            System.out.println(rectangle_02.longestLineWithin());
            System.out.println("");

            System.out.println(rectangle_03.calcArea());
            System.out.println(rectangle_03.longestLineWithin());
            System.out.println("");

            System.out.println(rectangle_04.calcArea());
            System.out.println(rectangle_04.longestLineWithin());
            System.out.println("");

            System.out.println(rectangle_05.calcArea());
            System.out.println(rectangle_05.longestLineWithin());
            System.out.println("");

            // User input
            Scanner user_triangle_selection = new Scanner(System.in);
            System.out.println("Select triangle from 1-5");

            int user_input = user_triangle_selection.nextInt();
            if (user_input == 1) {
                rectangle_01.doubleSize();
            }
            else if (user_input == 2) {
                rectangle_02.doubleSize();
            }
            else if (user_input == 3) {
                rectangle_03.doubleSize();
            }
            else if (user_input == 4) {
                rectangle_04.doubleSize();
            }
            else if (user_input == 5) {
                rectangle_05.doubleSize();
            }
            else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Program completed.");
        };
    }
