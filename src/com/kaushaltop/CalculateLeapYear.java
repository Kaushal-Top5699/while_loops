package com.kaushaltop;

public class CalculateLeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if (year%4 == 0) {

                if (year%100 != 0) {

                    System.out.println("Year "+year+" is a leap year");

                    return true;

                } else {

                    if (year%400 == 0) {

                        System.out.println("Year "+year+" is a leap year");

                        return true;

                    } else {

                        return false;
                    }
                }
            } else {

                return false;
            }
        }
        System.out.println("Year "+year+" not in range");
        return false;
    }

    public static int displayLeapYearsUsingWhile(int start, int end) {

        if (start > 0) {

            while (start <= end) {

                start++;

                if (!isLeapYear(start)) {

                    continue;
                }
            }
        }
        System.out.println("Invalid Input");
        return 0;
    }
}
