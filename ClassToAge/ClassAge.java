
package classage;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class ClassAge {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter the age of the student:");
        
        int age = input.nextInt();
        
        if (age>=5 && age<12){
            
            System.out.println("The student is in Elementary school");
            
        }else if (age >=12 && age < 14){
            
            System.out.println("The student is in Secondary school");
        }else if (age >= 15 && age <= 18){
            
            System.out.println("The student is in High school");
        }else if (age >= 0 && age <= 4){
            
            System.out.println("Sorry you are too young to go to school,You can try in "+(5-age)+" years");
        }
        
    
    
    }
}