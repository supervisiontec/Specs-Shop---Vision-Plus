/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import java.util.Scanner;

/**
 *
 * @author kasun
 */
public class Sum {

    public static void main(String[] args) {
        int noOne, noTwo, noThree;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        noOne = scanner.nextInt();

        System.out.print("Enter second number : ");
        noTwo = scanner.nextInt();

        System.out.print("Enter threed number : ");
        noThree = scanner.nextInt();

        System.out.println("The result is " + ((noOne + noTwo) == noThree));

    }
}
