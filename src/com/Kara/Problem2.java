package com.Kara;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by stiri on 9/20/2016.
 */
public class Problem2 {
    private static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> recyclingArray = new ArrayList<Integer>();

        int numberOfCrates = 0;

        int max = getMaxValue(recyclingArray);
        int min = getMinValue(recyclingArray);
        int displayResult = 0;

        for (int i=0; i<recyclingArray.size(); i++){
            System.out.println("How many crates of recycling does House" +
                    "number " + (i + 1) + " have?");
            numberOfCrates = numberScanner.nextInt();
            displayResult = calculateRecycling(numberOfCrates);

        }



    }

    private static int calculateRecycling(int numberOfCrates) {
        int totalCrates = 0;
        totalCrates += numberOfCrates;

        return  totalCrates;

    }

    private static int getMinValue(ArrayList<Integer> recyclingArray) {
        int min = recyclingArray.get(0);
        for (int i = 0; i < recyclingArray.size(); i++){
            if (recyclingArray.get(i) < min){
                min = recyclingArray.get(i);
            }
        }
        return min;
    }

    private static int getMaxValue(ArrayList<Integer> recyclingArray) {
        int max = recyclingArray.get(0);
        for (int i=0;  i < recyclingArray.size(); i++){
            if (recyclingArray.get(i) > max) {
                max = recyclingArray.get(i);
            }
        }
        return max;

    }
}
