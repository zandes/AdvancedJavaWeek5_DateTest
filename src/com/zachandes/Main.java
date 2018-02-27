package com.zachandes;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Date joshuaTreeRelease = new GregorianCalendar(1987,2,9).getTime();
        Date rattleAndHumRelease = new GregorianCalendar(1988,9,10).getTime();
        Date today = new Date();

        long joshuaAndHumDiff = rattleAndHumRelease.getTime() - joshuaTreeRelease.getTime();
        long newDay = today.getTime() + joshuaAndHumDiff;

        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        String dateOut = dateFormatter.format(newDay);
        System.out.println(dateOut);
    }
}
