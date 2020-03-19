/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datingapp.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class DatingApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Kalispera,Gia na mporeis na vgeis me tin kori mou tha xreiastei na kataxoriseis kapoia stoixeia prota");

        System.out.println("Parakalo kataxorise tin ilikia sou");

        int age = input.nextInt();
        boolean age2 = (age >= 25) && (age <= 45);
        
       System.out.println("Parakalo kataxorise to eisodima sou");

        int income = input.nextInt();
        boolean income2 = income >= 15000;
        
        System.out.println("Parakalo kataxorise poso omorfos eisai xrisimopoiontas mia klimaka apo to 0.0 eos to 10.0");

        double cute = input.nextDouble();
        boolean cute2 = cute >= 8.3;
                
        boolean permission = age2 && (income2 || cute2) ;
        
        System.out.println("Mias kai i ilikia soy einia "+age+" kai to eisodima sou einai "+income+" tote einai "+permission+" na vgeis me tin kori mou");
        
        if(permission==false){
            if(age2==false){
                if (age < 25) {
            System.out.println("Eisai poli mikros na vgeis me tin kori mou");
        } else if (age > 45){
            System.out.println("Eisai poli megalos gia na vgeis me tin kori mou");} }
            
            if(income2==false){
                if(income<15000 && cute <8.3)
                    System.out.println("Eisai kai ftoxos kai asximos");
            }
        }
        if(permission==true){
            if(income2==false){
                if(cute > 8.3)
                    System.out.println("Eisai ftoxos alla oraios");
            }
            }
        if(permission==true){
            if(income2==true){
                if(cute < 8.3)
                    System.out.println("Eisai kakasximos alla plousios $$");
            }
        }
            
                    
        }
        
    
    }


