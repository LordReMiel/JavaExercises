package workingdays;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class WorkingDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the day to inform you about the TODO list");

        String[] week = {"Monday", "Tuesday", "Wednesday", "Tuesday", "Friday", "Saturday", "Sunday"};
        ;

        for (String days : week) {

            System.out.println(days);

        }

        String day = input.next().toLowerCase();

        dayOfTheweek(day); // case method
    }

    public static void dayOfTheweek(String day) {

        switch (day) {

            case "monday":
                System.out.println("Go to work to earn $$");
                break;

            case "tuesday":
                System.out.println("Go to work to earn $$");
                break;

            case "wednesday":
                System.out.println("Go to work to earn $$");
                break;

            case "thursday":
                System.out.println("Go to work to earn $$");
                break;

            case "friday":
                System.out.println("Go to work to earn $$");
                break;

            case "saturday":
                System.out.println("Enjoy Life!!!");
                break;

            case "sunday":
                System.out.println("Enjoy Life!!!");
                break;

        }
    }
}
