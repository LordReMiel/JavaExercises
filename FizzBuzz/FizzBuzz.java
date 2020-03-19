
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class FizzBuzz {

    /* To parakato programa zitei apo ton xristi na kataxorisi enan arithmo,An einai pollaplasio tou 5 ektiponei tin leksi Fizz 
    an einai pollaplasio tou 3 ektiponei tin leksi Buzz.An einai pollaplasio kai ton dio ektiponei tin leksi FizzBuzz
kai an den einai pollaplasio kanenos ektiponei ton arithmo*/

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number :");
        
        int number = input.nextInt();
        
        
        if (number%5==0 && number%3==0)
            
            System.out.println("FizzBuzz");
        else if (number%5==0){
            
            System.out.println("Fizz");}
        
        else if (number%3==0){
            
            System.out.println("Buzz");
        }else
            
            System.out.println("Number:"+number);
        
    }
    
}
