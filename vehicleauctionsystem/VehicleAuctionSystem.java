/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleauctionsystem;

/**
 *
 * @author suuna stanely
 */
import java.util.Scanner;

public class VehicleAuctionSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Capture Vehicle Details
        System.out.print("Enter Vehicle Registration Number: ");
        String regNo = input.nextLine();
        
        System.out.print("Enter Original Vehicle Cost: ");
        double vehicleCost = input.nextDouble();
        
        System.out.print("Enter Total Expenses incurred on vehicle: ");
        double expenses = input.nextDouble();

        // 2. Process 3 Bidders to find the highest price
        double highestBid = 0;
        String winnerName = "";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Name for Bidder " + i + ": ");
            String name = input.next();
            System.out.print("Enter Bid Amount for " + name + ": ");
            double currentBid = input.nextDouble();

            if (currentBid > highestBid) {
                highestBid = currentBid;
                winnerName = name;
            }
        }

        // 3. Financial Calculations
        System.out.print("\nEnter deposit amount made by " + winnerName + ": ");
        double deposit = input.nextDouble();
        
        double balance = highestBid - deposit;
        double totalInvestment = vehicleCost + expenses;
        double profitOrLoss = highestBid - totalInvestment;

        // 4. Display Results
        System.out.println("\n--- AUCTION SUMMARY ---");
        System.out.println("Vehicle Reg No: " + regNo);
        System.out.println("Highest Bidder: " + winnerName + " with " + highestBid);
        System.out.println("Balance to be cleared: " + balance);
        
        if (profitOrLoss > 0) {
            System.out.println("Profit Made: " + profitOrLoss);
        } else {
            System.out.println("Loss Incurred: " + Math.abs(profitOrLoss));
        }
    }
}
