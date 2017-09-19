package com.example.common;
import java.util.Scanner;

public enum Month {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String englishName;

    Month(String name) {     // allow us to make an instance/object of Month
        this.englishName = name;
    }

    public String getEnglishName() {
        return englishName;
    }
}


