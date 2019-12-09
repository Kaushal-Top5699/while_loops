package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        CalculateLeapYear.displayLeapYearsUsingWhile(2000, 2050);

        //Both of the below while loops are same!
        int count = 1;
        while (count != 6) {

            System.out.println(count);
            count++;

        }

        int count2 = 1;
        while (true) {

            if (count2 == 6) {
                break;
            }
            System.out.println(count2);
            count2++;

        }

        //Here we set the while condition at the of the loop!
        int count3 = 1;
        do {

            System.out.println("Count value is "+count3);
            count3++;

        } while (count3 != 6);

        int start = 4;
        int end = 20;

        while (start <= end) {

            start++;

            if (!isEvenNumber(start)) {

                continue;
            }

            System.out.println("Even number "+start);

            count++;

            if (count >= 5) {

                break;
            }
        }
        System.out.println(count);


    }

    public static boolean isEvenNumber(int number) {

        if (number%2 == 0) {

            return true;
        }
        return false;

    }

}
