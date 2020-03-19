
package adult;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class Adult {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter your age :");
        
        int age = input.nextInt();
        
        
        String adult = age > 0 && age <18?"You are a Child":"Your are an Adult";
        
        System.out.println(adult);
        
        
        
        
    }
    
}
