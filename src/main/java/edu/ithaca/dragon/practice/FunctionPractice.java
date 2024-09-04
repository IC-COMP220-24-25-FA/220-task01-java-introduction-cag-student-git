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
        if (numbers.size() == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        int largest_number_index = 0;
        int largest_number = numbers.get(0);
        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largest_number) {
                largest_number = numbers.get(i);
                largest_number_index = i;
            }
        }
        return largest_number_index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        int largest_number_index = 0;
        int largest_number = numbers.get(0);
        for (i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= largest_number) {
                largest_number = numbers.get(i);
                largest_number_index = i;
            }
        }
        return largest_number_index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        if (words.size() == 0) {
            throw new IllegalArgumentException();
        }
        int j = 0;
        int i = 0;
        String highest_count_string = words.get(0);
        int highest_count_char = 0;
        int highest_count_char_index = 0;
        for (i = 0; i < words.size(); i++) {
            int letter_count = 0;
            j = 0;
            for (j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).charAt(j) == letter) {
                    letter_count++;
                }
            }
            if (letter_count > highest_count_char) {
                highest_count_char = letter_count;
                highest_count_char_index = i;
                highest_count_string = words.get(i);
            }
        }
        return highest_count_string;
    }


}
