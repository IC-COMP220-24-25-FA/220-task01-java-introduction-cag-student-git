package edu.ithaca.dragon.shapes;

import javax.sound.midi.Receiver;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Rectangle rectangle_01 = new Rectangle(Math.random() * 10, Math.random() * 10);
        System.out.println(rectangle_01.calcArea());
        System.out.println(rectangle_01.longestLineWithin());
        System.out.println("");

        Rectangle rectangle_02 = new Rectangle(Math.random() * 10, Math.random() * 10);
        System.out.println(rectangle_02.calcArea());
        System.out.println(rectangle_02.longestLineWithin());
        System.out.println("");

        Rectangle rectangle_03 = new Rectangle(Math.random() * 10, Math.random() * 10);
        System.out.println(rectangle_03.calcArea());
        System.out.println(rectangle_03.longestLineWithin());
        System.out.println("");

        Rectangle rectangle_04 = new Rectangle(Math.random() * 10, Math.random() * 10);
        System.out.println(rectangle_04.calcArea());
        System.out.println(rectangle_04.longestLineWithin());
        System.out.println("");

        Rectangle rectangle_05 = new Rectangle(Math.random() * 10, Math.random() * 10);
        System.out.println(rectangle_05.calcArea());
        System.out.println(rectangle_05.longestLineWithin());
        System.out.println("");
        };
    }
