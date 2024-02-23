/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        
        System.out.println("Enter your favorite actor:");
        String favoriteActor = scanner.nextLine();

        System.out.println("Hello, " + name + "! Your favorite actor is " + favoriteActor + ".");

        scanner.close();
    }
}
