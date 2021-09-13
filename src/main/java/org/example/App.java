/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        Double principal=input.nextDouble();
        System.out.print("What is the rate? ");
        Double interest=input.nextDouble();
        System.out.print("What is the number of years? ");
        Double years=input.nextDouble();
        System.out.print("What is the number of times the interest is compounded per year? ");
        Double compound=input.nextDouble();

        double interestRate=interest/100;
        double total=Math.pow((1+interestRate/compound), (compound*years));
        total=total*principal;

        System.out.printf("$%.0f invested at %.01f%% for %.0f years compounded %.0f times per year is $%.02f",principal,interest,years,compound,total);
    }
}
