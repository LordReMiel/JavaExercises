/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalClassProject;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class FinalClassProject {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("================  Please enter your name: ================");

        String name = input.next();
        System.out.println("                        ");

        System.out.println("You either enter M if you are Male or F if you are Female"+"\nPlease " + name + " enter your sex:");

        char sex = input.next().charAt(0);
        
        System.out.println("================ Please "+ name +" Enter Your Age ================");
        int age = input.nextInt();
        
        System.out.println(ageOfNow(age, name));
        System.out.println(" =================== S E A SO N S ==================");
        System.out.println("");
        System.out.println("Now " + name + " i want you to choose what your favorite season is.");
        System.out.println("");
        System.out.println("You will have to choose the corresponding number on the options below:");

        System.out.println(season());
        System.out.println("");
        System.out.println("Now " + name + " Please enter your height");

        double height = input.nextDouble();

        System.out.println("Now " + name + " Please enter your weight:");

        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("So " + name + " based on the data you entered your Body Mass Index is :" + bmi);
        
        System.out.println("");
                
        if (bmi < 18.5) {
            System.out.println(name + " You are Underweight");
        } else if (bmi < 24.9) {
            System.out.println(name + " Normal weight ");
        } else if (bmi <= 29.9) {
            System.out.println(name + " You are Overweight ");
        } else if (bmi >= 30) {
            System.out.println(name + " You are obese ");
        }
        System.out.println("");
        
        System.out.println("Now let's find what is your lucky day " + name);

        luckyDay(age);

        System.out.println("==================================================");

        String[] luckyday2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("================== "+name+" Your lucky day is :" + luckyday2[luckyDay(age)] + "==================");

        System.out.println("");
        
        System.out.println("Now let's see if you can go to a Private club named \"Lucky day\"");
        System.out.println("");
        System.out.println("There is a man in the entrance and tells you:\nOnly people that their lucky day is Wednesday can enter\nLet's see if you can enter");
        System.out.println(entrance(luckyDay(age),age, sex, name));

    }

    static int luckyDay(int age) {
        int ageToDays = age * 365;

        int sum = 0;
        while (ageToDays > 0) {
            sum += ageToDays % 10;
            ageToDays = ageToDays / 10;
        }

        if (sum > 6) {

            sum = sum % 7;
        }
        return sum;
    }

    static String entrance(int luckyDay, int age, char sex, String name) {
        Scanner input = new Scanner(System.in);

        if (luckyDay == 2 && 20 <= age && age <= 40) {

            if (20 <= age && age <= 25 && sex == 'M') {

                return "You can enter  to the club";

            } else if (age > 25 && sex == 'M') {

                return "You can enter the club Mr " + name;

            }

            if (sex == 'F') {

                System.out.println("Are you married  choose the appropriate number");

                String[] marriage = {"1.Yes", "2.No"};

                for (int i = 0; i < 2; i++) {

                    System.out.println(marriage[i]);
                }

                int marriage2 = input.nextInt();

                if (marriage2 == 1) {

                    return "Welcome Mrs " + name;

                } else {

                    return "Welcome Miss " + name;
                }
            }
        } else {
            return "Sorry,it seems it isn't your Lucky Day today.You can't enter the club";
        }
        return "Sorry,it seems it isn't your Lucky Day today.You can't enter the club";
    }

    static String season() {
        String[] season = {" Winter", " Spring", " Summer", " Autumn"};

        int i;
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 4; i++) {

            System.out.println((i + 1) + ". " + season[i]);
        }

        i = input.nextInt();

        if ((i - 1) == 0) {

            return "It must be cold outside";

        } else if ((i - 1) == 1) {

            return "Ohh, flowers are very beautiful these days";

        } else if ((i - 1) == 2) {

            return "Let's go for swimming";

        } else if ((i - 1) == 3) {

            return "The trees are full of brown leaves";
        }
        return "";
    }

    static String ageOfNow(int age,String name) {

      
        System.out.println("");
        if (0 <= age && age <= 5) {

            System.out.println(name + " You are too young for this application ");

            System.out.println(name + " Please come back in" + (6 - age));

        } else if (6 <= age && age < 18) {

            System.out.println(name + " Oh you are a student");

            System.out.println(name + " Keep up.. " + (18 - age));

        } else if (19 <= age && age <= 40) {

            System.out.println(name + " Well you must be employed");
            System.out.println(" ");
            System.out.println(name + " You finished school " + (age - 18) + " years ago");
        }

        int age2 = 2020 - age;

        if (age2 > 1980) {

            System.out.println(name + " It appears you weren't born in 1980");
            System.out.println("===========================");
            System.out.println("But your age in 2040 will be " + (2040 - age2) + " " + name);

        } else if (age2 == 1980) {

            System.out.println(name + " It appears you were born in 1980");

            System.out.println(" Just to inform you " + name + " that your age in 2040 will be " + (2040 - age2));

        } else {

            System.out.println(name + " It appears that your age back in 1980 was " + (1980 - age2));

            System.out.println(" And your age " + name + " in 2040 will be " + (2040 - age2));

        }

        return "";
    }
}
