package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(2, 4);
        assertEquals(4, myTriangle.calcArea(), 0.001);

        myTriangle = new Triangle(1, 0.5);
        assertEquals(0.25, myTriangle.calcArea(), 0.001);
    }

    @Test
    public void doubleSizeTest(){
        // Not implemented yet
    }

    @Test
    public void longestLineWithinTest(){
        // Not implemented yet
    }
}