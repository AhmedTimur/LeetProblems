package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> numbers = new ArrayList<>();
        getIndices(numbers);

    }

    public static void getIndices(ArrayList<Integer> numbers) {
        Random randomNumbers = new Random();

        for(int i = 0; i < 5; i++) {
            numbers.add(randomNumbers.nextInt(1,6));
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target number: ");
        int target = input.nextInt();

        System.out.print("Elements of an Array List: ");
        for(int i: numbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Found indices: ");
        for(int i = 0; i < numbers.size()-1; i++) {
            for(int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == target) {
                    System.out.print(" | " + numbers.indexOf(numbers.get(i)) + ", " + numbers.indexOf(numbers.get(j)) + " | ");
                }
            }
        }
    }
}
