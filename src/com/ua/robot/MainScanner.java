
package com.ua.robot;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int fromInput = scanner.nextInt();
        System.out.println("Your input: " + fromInput);
    }
}

