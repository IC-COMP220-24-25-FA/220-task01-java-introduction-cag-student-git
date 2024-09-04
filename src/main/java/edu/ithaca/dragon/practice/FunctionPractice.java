package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0) {
            throw new IllegalArgumentException();
        }
        if (second < 0) {
            throw new IllegalArgumentException();
        }
        if (third < 0) {
            throw new IllegalArgumentException();
        }
        if (first > second) {
            if (second > third) {
                return first;
            }
            else {
                return third;
            }
        }
        else {
            if (first > third) {
                return second;
            }
            else {
                return first;
            }
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double adjust_for_discount = originalPrice - (originalPrice * discountPercent * 0.01);
        return adjust_for_discount - (adjust_for_discount * salesTax * 0.01);
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        // I wasn't sure what was being asked of me here
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        int i = 0;
        int largest_number = numbers.get(0);
        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largest_number) {
                largest_number = numbers.get(i);
            }
        }
        return largest_number;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
