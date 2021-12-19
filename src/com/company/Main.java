package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Kirjoita eka numero ");
        num1 = input.nextInt();

        System.out.println("Kirjoita toka numero ");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Kirjoita + , - , / tai * ");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Vastaus " + (num1 + num2));
        }
        else if  (operation.equals("-"))
        {
            System.out.println("Vastaus " + (num1 - num2));
        }

        else if (operation.equals("/"))
        {
            System.out.println("Vastaus " + (num1 / num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Vastaus " + (num1 * num2));
        }
        else
        {
            System.out.println("Väärä valinta.");
        }
    }
}

