/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, " + input.next() + ", nice to meet you!");
    }
}

