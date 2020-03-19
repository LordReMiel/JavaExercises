
package bestfriends;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ReMieL
 */
public class BestFriends {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        ArrayList <String> bestFriends = new ArrayList();
        System.out.println("Please insert the names of your 4 best friends:");
        
        System.out.println("Please enter the first name");
        
        String friend = input.next();
        bestFriends.add(friend);
        
        
        System.out.println("Please enter the second name");
        
        friend = input.next();
        bestFriends.add(friend);
        
        System.out.println("Please enter the third name");
        
        friend = input.next();
        bestFriends.add(friend);
        
        System.out.println("Please enter the fourth name");
        
        friend = input.next();
        bestFriends.add(friend);
        
        System.out.println("============== Simple For ==============");
        
        System.out.println("The names you entered are:");
        
        int i;
        for (i=0; i<bestFriends.size(); i++)
            
            System.out.println((i+1)+"."+bestFriends.get(i));
            
        i = 1;
        System.out.println("============== Enhanced For ==============");
        for(String bff:bestFriends){
            
            System.out.println(i+"."+bff);
            i++;
        }
        
        System.out.println("============== While ==============");
        
        
        i = 0;
        while(i<bestFriends.size()){
            
            System.out.println((i+1)+". "+bestFriends.get(i));
            i++;
            
        }
        
        System.out.println("============== Do While ==============");
        
        i = 0;
        
        do{ 
            
            System.out.println((i+1)+". "+bestFriends.get(i));
            i++;
        }while (i<bestFriends.size());
               
                 
                 
                
    } 
}
        


    
    

