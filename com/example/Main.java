package com.example;

import java.util.Scanner;

import com.example.common.Month;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // this creates a scanner to be used
        System.out.println("enter a month");            // this prompts user to enter in info
        String[] months = new String[12];                 // this creates an array to be used later
        String input = scanner.nextLine();              // this stores user input into 'input'
        Month month = Month.valueOf(input.toUpperCase());            // type Month. the string value (obtained from valueOf is stored in month

        //it is looping through the string values of what is inputted
        int n = 0;
        switch (month) {
            case JANUARY:
                months[n++] = Month.JANUARY.getEnglishName();
            case FEBRUARY: {
                months[n++] = Month.FEBRUARY.getEnglishName();
            }
            case MARCH:
                months[n++] = Month.MARCH.getEnglishName();
            case APRIL:
                months[n++] = Month.APRIL.getEnglishName();
            case MAY:
                months[n++] = Month.MAY.getEnglishName();
            case JUNE:
                months[n++] = Month.JUNE.getEnglishName();
            case JULY:
                months[n++] = Month.JULY.getEnglishName();
            case AUGUST:
                months[n++] = Month.AUGUST.getEnglishName();
            case SEPTEMBER:
                months[n++] = Month.SEPTEMBER.getEnglishName();
            case OCTOBER:
                months[n++] = Month.OCTOBER.getEnglishName();
            case NOVEMBER:
                months[n++] = Month.NOVEMBER.getEnglishName();
            case DECEMBER:
                months[n++] = Month.DECEMBER.getEnglishName();
        }

        // add to array
        for (int i = 0; i < months.length; i++) {

            System.out.println(months[i]);

        }
    }
}


