package org.example;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade please bease: ");
        int grade = input.nextInt();
        if (grade < 60) {
            System.out.println("YOU... FAIIIILLLLLLL");
        }  else if (grade < 70) {
            System.out.println("you get a d son, a D");
        }  else if (grade < 80) {
            System.out.println("you get a C coy boi");
        } else if (grade < 90) {
            System.out.println("you get a B baby boi");
        } else {
            System.out.println("A");
        }
    }
}