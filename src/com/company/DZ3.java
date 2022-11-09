package com.company;

public class DZ3 {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Common weight: " + (firstBoxerWeight + secondBoxerWeight));
        double difference;
        if(firstBoxerWeight > secondBoxerWeight) {
            difference = firstBoxerWeight - secondBoxerWeight;
            System.out.println("Difference in weight: " + difference);
        }
        else if(secondBoxerWeight > firstBoxerWeight) {
            difference = secondBoxerWeight - firstBoxerWeight;
            System.out.println("Difference in weight: " + difference);
        }
        System.out.println("-----------------------------");
        System.out.println("Another mean:");
        if(firstBoxerWeight > secondBoxerWeight) {
            difference = firstBoxerWeight % secondBoxerWeight;
            System.out.println("Difference in weight: " + difference);
        }
        else if(secondBoxerWeight > firstBoxerWeight) {
            difference = secondBoxerWeight % firstBoxerWeight;
            System.out.println("Difference in weight: " + difference);
        }
    }
}
