/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ReMieL
 */
public class Recap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input = new Scanner (System.in);
     
        System.out.println("Please enter 3 names ");
        
        System.out.println("Please enter the first name:");
        
        String name = input.next();
        
        System.out.println("Please enter the second name: ");
        
        String name2 = input.next();
        
        System.out.println("Please enter the third name: ");
        
        String name3 = input.next();
        
        String []array = { name, name2 ,name3 };
        
        ArrayList <String> listOfNames = new  ArrayList();
        
        listOfNames.add(0, name);
        listOfNames.add(1, name2);
        listOfNames.add(2, name3);
        
        System.out.println(" ================ Printing the names in the Array  ================ ");
        
        int i;
        
        for(i=0; i<3; i++){
            
            System.out.println(i+"."+array[i]);
        }
        
        System.out.println(" ================ Printing the names in the Array List  ================ ");
        
        for (i=0; i<3; i++){
            
            System.out.println(i+"."+listOfNames.get(i));
        }
        
        System.out.println("======================== Checking Names ======================== ");
        
        if (array[2]== listOfNames.get(2)){
            
            System.out.println("The names are equal");
            System.out.println("The name in the Array is "+ array[2]+"\nThe name in the List of Names in index 2 is :"+listOfNames.get(2));
        }else{
            
            System.out.println("The names are not equal");
            
            System.out.println("The name in the Array is \n"+ array[2]+"The name in the List of Names in index 2 is :"+listOfNames.get(2));
        }
        
        System.out.println("Please enter another name :");
        
        name = input.next();
        
        listOfNames.add(2, name);
        
        boolean areEqual;
        
        areEqual = array[2]== listOfNames.get(2);
        
        System.out.println("======================== Checking Names ======================== ");
        
        System.out.println("After checkig the names on the both indexes we see that the statement is "+areEqual);
        
        System.out.println("The reason is that the name that exists in Array [2] is "+array[2]+"\nAnd the name that exists in List of Names is: "+listOfNames.get(2));
        
        
        System.out.println("==================== Swaping Names according with the Numbers ==================== ");
        
        System.out.println("Now you will need to enter 2 number.The numbers must be between 0 - "+(array.length-1));
        
        System.out.println("Please enter the First Number");
        
        int number = input.nextInt();
        
        
        while (number>= array.length){
            
            System.out.println("The number you entered is not valid ");
            
            System.out.println("Please enter a new number");
            
            number = input.nextInt();
        }
        System.out.println("Please enter the Second Number ");
        
        int number2 = input.nextInt();
        
        while (number2 >= array.length || number2==number){
            
            System.out.println("The number you entered is not valid ");
            
            System.out.println("Please enter a new number");
            
           number2 = input.nextInt();
        
        }
           name = array[number];
           name2 = array[number2];
           
        ArrayList <String> testArray = new ArrayList();
        
        testArray.add(0, name);
        testArray.add(1, name2);
        
        System.out.println("The List of Names that exist on the New Array list are :\n"+1+"."+testArray.get(0)+"\n"+2+"."+testArray.get(1));
    
      listOfNames.remove(name);
      listOfNames.remove(name2);
      
      
        System.out.println("================= Final Printing after the Removal ==================");
        
        System.out.println("================ The List of Names now is ====================");
        
        for (i=0; i< listOfNames.size(); i++){
            
            System.out.println((i+1)+"."+ listOfNames.get(i));
        }
        
        System.out.println("================ The  New List of Names now is ====================");
        
        for (i=0; i< testArray.size(); i++){
            
            System.out.println((i+1)+"."+ testArray.get(i));
    }
    }
}

