package agetodo;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class AgetoDo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age :");

        int age = input.nextInt();

        if (age >= 0 && age < 16) {

            System.out.println("You cannot drive");

        } else if (age >= 16 && age <= 17) {

            System.out.println("You can drive but not vote");

        } else if (age >= 18 && age <= 21) {

            System.out.println("You can vote but not drink");

        } else if (age >= 22) {

            System.out.println("You can do anything");
        }

    }

}
