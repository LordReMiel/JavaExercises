
package planetaryweight;

import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class PlanetaryWeight {
/* To parakato programma anaferei ston xristi na kataxorisi to varos tou kai na epileksei ton agapimeno tou planiti
    kai ton enimeronei poso tha itan to varos tou ston sigkekrimeno planiti
    */
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter your weight :");
        
        double weight = input.nextDouble();
        
        System.out.println("Now select the number that corresponds to your favorite planet");
        
        String [] planets = {"Venus", "Mars", "Jupiter", "Saturn", "Uranus","Neptune"};
        
        int i=0;
        for (String planet:planets){
            
            System.out.println(i+1+"."+planet);
            i++;
        }
        
        int planet = input.nextInt();
        
        switch (planet){
            
            case 1:
                weight = weight*0.78;
                System.out.println("Your Weight in "+planets[0]+" is: "+weight*0.78);
                break;
                
            case 2:
                
                weight = weight*0.39;
                System.out.printf("Your Weight in "+planets[1]+" is: %,.2f\n",weight);
                break;
                
           case 3:
               
                weight = weight*2.65;
                System.out.printf("Your Weight in "+planets[2]+" is: %,.2f\n",weight);
                break;
                
           case 4:
                 
                weight = weight*1.17;
                System.out.printf("Your Weight in "+planets[3]+" is: %,.2f\n",weight);;
                break;
           
           case 5:
               
                weight = weight*1.05;
                System.out.printf("Your Weight in "+planets[4]+" is: %,.2f\n",weight);
                break;
                
          case 6:
              
                weight = weight*1.23;
                System.out.printf("Your Weight in "+planets[5]+" is: %,.2f\n",weight);
                break;
        }
        
        
    }
    
}
