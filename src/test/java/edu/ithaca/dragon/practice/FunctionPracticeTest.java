package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        // Check that the largest of the three values of 5, which is the largest inputted
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        // Same as above, but the largest input (5), is in a different parameter
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        // Same as above, but the largest input (5), is in a different parameter
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        // Check that the program returns the correct value when all inputs are identical
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        // Check that the program returns an error when a negative value is inputted in all positions
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        // Check that the program returns an error when a negative value is inputted in at least one position
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        // Check that the program returns an error when a negative value is inputted in at least one position, but in a differnt parameter
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(9.5, FunctionPractice.calcSalePrice(100, 90, 5), 0.0001);
        assertEquals(0, FunctionPractice.calcSalePrice(10, 100, 8), 0.0001);
        assertEquals(25, FunctionPractice.calcSalePrice(50, 50, 0), 0.0001);
        assertEquals(37.5, FunctionPractice.calcSalePrice(50, 0, 25), 0.0001);
    }

    // @Test
    // public void isGoodDogTest(){
    //     assertEquals(STR, STR);
    // }

    @Test
    public void findFirstLargest(){
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(3);
        assertEquals(2, FunctionPractice.findFirstLargest(testList));
    }

        @Test
    public void findLastLargest(){
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(3);
        assertEquals(2, FunctionPractice.findLastLargest(testList));
    }
}
