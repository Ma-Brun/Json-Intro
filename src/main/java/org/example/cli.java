package org.example;

import java.util.Scanner;

public class cli {
    public static void apiInput() throws InterruptedException{
        System.out.println("Enter the api link you would like to use");
        Scanner scanner = new Scanner(System.in);
        String api = scanner.nextLine();
        System.out.println("You would like to use " + api + " correct?");
    }
    public static void confirmation() throws InterruptedException {
        System.out.println("If this is the link you would like to use, please re-enter it");
    }
    public static String Input1() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String api = scanner.nextLine();
        return api;

    }
    public static boolean yesno() {
        Scanner scanner = new Scanner(System.in);
        String yesNo = scanner.nextLine();
        if (yesNo.equalsIgnoreCase("yes")) {
            return true;
        } else if (yesNo.equalsIgnoreCase("no")) {
            return false;
        }
        else {
            return false;
        }
    }
}
