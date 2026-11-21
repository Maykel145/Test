// Write a program that prints the even an odd numbers from 0-n :
package edu.zuj.procedural.Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                    System.out.println(i+ " is an odd number.");
                }
            }
        }
    }

