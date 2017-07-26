package com.moosehub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        intro();
        println("Please enter some details...");
        println();

        String input = scanner.nextLine();

    }

    public static void dialog(String character, String content) {
        String output = String.format("%s: %s", character, content);
        System.out.println(output);
    }

    public static void sleep(long millis) {
        try
        {
            Thread.sleep(millis);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void intro() {
        println("Welcome to Moosecoop's \"Stream Desk Review Simulator\"!");
        println("\n\nPress the numbers on your keyboard and press enter to make choices!");
    }

    public static void println(String content) {
        System.out.println(contents);
    }

    public static void println(int Length) {

    }

}
