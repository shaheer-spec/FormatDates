package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(dateTimeFormatter2));

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(date.format(dateTimeFormatter3));

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        String formatedDate4 = dateTime.format(dateTimeFormatter4);
        System.out.println(formatedDate4);
        // Initial attempt without GMT time

        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        System.out.println(dateTime.format(dateTimeFormatter5));

    }
}
