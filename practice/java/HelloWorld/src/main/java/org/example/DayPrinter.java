package org.example;

import java.util.Scanner;
public class DayPrinter {
        public static void main(String[] args) {
           /* Scanner in = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int dayNum = in.nextInt();

            String day;
            if (dayNum == 0) {
                day = "Sunday";
            } else if (dayNum == 1) {
               day = "Monday";
            } else if (dayNum == 2) {
                day = "Tuesday";
            } else if (dayNum == 3) {
               day = "Wednesday";
            }  else if (dayNum == 4) {
                day = "Thursday";
            } else if (dayNum == 5) {
                day = "Friday";
            } else if (dayNum == 6) {
                day ="Saturday";
            } else {
                day = "Int does not correspond to a day of the week";
            }
            System.out.println(day);*/

            for (int i = 0; i < 10; i++){
                System.out.println(i);
            }

            for (double i = 100; i > 0; i -= 5) {
                System.out.println(i);
            }

            int numberArray[] = {1, 3, 4, 5, 6, 7, 8, 10};
            System.out.println("Number array is: " + numberArray);
            for (int i: numberArray) {
                System.out.println(i);
            }

            String message = "Hi everybody";

            for (char c: message.toCharArray()) {
                System.out.println(c);
            }

            System.out.println(message);

            int i = 0;
            while (i < 4) {
                System.out.println("I is now:" + i);
                i++;
            }

            do {
                System.out.println(i);
                i++;
            } while (i+1 < 10);

            int[] someIntsArray = {0, 1, 10, 2, 3, 4, 5, 6, 10, 10, 10, 1, 4, 10, 5};
            int searchTerm = 10;
            System.out.println(someIntsArray.length);
            i = 1;
            int j = 0;
            for (int number : someIntsArray) {
                if (number == searchTerm) {
                    System.out.println("Found "+searchTerm+" in the array during crank: "+ i+" array number "+someIntsArray[j]);
                    i++;
                    j++;
                    //continue;
                }
                System.out.println(searchTerm+ " not this crank number: " + i);
                i ++;
                j++;
            }

        }

    }
