/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final int HD = 50;
    final int Q = 25;
    final int D = 10;
    final int N = 5;
    final double P = 0.01;
    int remaingCoins = 0;
    
    Scanner scan = new Scanner ( System.in );
    DecimalFormat PricePattern = new DecimalFormat("$#0.00");
    System.out.print( "Enter cost of item >");
    double itemCost = scan.nextDouble( );
    System.out.print( "Enter amount paid > ");
    double itemPaid = scan.nextDouble( );
    
    double changeDue = itemCost - itemPaid;
    
    int remainingCoins = (int) (changeDue / P);
    
    int halfdollar = remainingCoins / HD;
    remainingCoins = remainingCoins % HD;
    int quarters = remainingCoins / Q;
    remainingCoins = remainingCoins % Q;
    int dimes = remainingCoins / D;
    remaingCoins = remainingCoins % D;
    int nickles = remainingCoins / N;
    remaingCoins = remainingCoins % N;
    
    
    System.out.print( "The item cost is " + PricePattern.format(itemCost) + "\n" 
                       + "You paid " + PricePattern.format(itemPaid) + "\n"
                       + "Your change is " + PricePattern.format(changeDue) + " : "  
                       + halfdollar + " halfdollars, " + quarters + " quarters, "
                       + dimes + " dimes, " + nickles + " nickles, " + remaingCoins + " pennies. ");
    }
    
}
