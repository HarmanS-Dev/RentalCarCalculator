package com.pluralsight;

import  java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What date willy you pick up the car? ");
        String pickupDate = input.nextLine();

        System.out.println("How many days would you like to rent the car for? ");
        int daysRental = input.nextInt();

        System.out.println("Would you like an electronic toll tag at $3.95/day? (yes/no)");
        input.nextLine();
        String tollTagOption = input.nextLine();

        System.out.println("Would you like a GPS at $@.95/day? (yes/no)");
        String gpsOption = input.nextLine();

        System.out.println("Would you like roadside assistance at $3.95/day? (yes/no)");
        String roadAssistanceOption = input.nextLine();

        System.out.println("How old are you currently? ");
        int age = input.nextInt();

        double basicCarRental = 29.99 * daysRental;

        double tollTagCost = 0;
        double gpsCost = 0;
        double roadAssistanceCost = 0;
        double optionsCost = 0;

        if (tollTagOption.equalsIgnoreCase("yes")){
            tollTagCost = 3.95 * daysRental;
        }
        if (gpsOption.equalsIgnoreCase("yes")){
            gpsCost = 2.95 * daysRental;
        }
        if (roadAssistanceOption.equalsIgnoreCase("yes")){
            roadAssistanceCost = 3.95 * daysRental;
        }

        optionsCost = tollTagCost + roadAssistanceCost + optionsCost;

        double underageSurcharge = 0;
        if (age <= 25){
            underageSurcharge = basicCarRental * .7;
        }

        double totalCost = basicCarRental + optionsCost + underageSurcharge;

        System.out.printf("""
                Base Rental Charge: $%.2f
                Options Cost: $%.2f
                Underage Drive Surcharge: $%.2f
                _______________________________
                Total Cost: $%.2f""", basicCarRental, optionsCost, underageSurcharge, totalCost);
    }
}
