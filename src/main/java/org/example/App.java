/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "How many euros are you exchanging? " );
        int c_from = Integer.parseInt( scan.nextLine() );
        System.out.print( "What is the exchange rate? " );
        double rate = Double.parseDouble( scan.nextLine() );

        double c_to = c_from * rate;

        System.out.println( c_from + " euros at an exchange rate of " + rate + " is");
        System.out.println( String.format("%.2f", c_to) + " U.S. dollars." );

    }
}
