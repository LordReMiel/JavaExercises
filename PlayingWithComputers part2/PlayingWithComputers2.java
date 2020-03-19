
package playingwithcomputers2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ReMieL
 */
public class PlayingWithComputers2 {

    
    public static void main(String[] args) {
    
        
        List <Computer> computers = new ArrayList();
        
        Desktop desktop1 = new Desktop("Asus", 700, true);
        
        Desktop desktop2 = new Desktop(500);
        
        System.out.println(desktop2.toString());
        
        Laptop laptop1 = new Laptop("Acer", 1_000, true);
        
        Laptop laptop2 = new Laptop("Sony", 850, false);
        
        Tablet tablet1 = new Tablet(500);
        
        Tablet tablet2 = new Tablet("Lenovo", 150, false);
        
        Desktop desktop3 = new Desktop("Lenovo", 800, false);
        
        
        Tablet tablet3 = new Tablet("Sony", 200, true);
        
        Laptop laptop3 = new Laptop("Lenovo", 750, true);
        
        Desktop desktop4 = new Desktop("Acer", 650, true);
        
        
        computers.add(tablet3);
        computers.add(laptop3);
        computers.add(desktop4);
        computers.add(desktop3);
        computers.add(tablet1);
        computers.add(laptop2);
        computers.add(laptop1);
        computers.add(desktop2);
        computers.add(desktop1);
        computers.add(tablet2);
        
        
        
        int sumSony = 0;
        
        int sumAcer = 0;
        
        int sumLenovo = 0;
        
        int sumAsus = 0;
        
        int sumUnknown = 0;
        
        int sumTotal =0;
        
        
        for(Computer comp:computers){
            
            if(comp.getBrand().equals("Sony")){
                
                sumSony = sumSony+comp.getPrice();
                
            }else if (comp.getBrand().equals("Acer")){
                
                sumAcer = sumAcer + comp.getPrice();
                
            }else if (comp.getBrand().equals("Lenovo")){
                
                sumLenovo = sumLenovo + comp.getPrice();
                
            }else if (comp.getBrand().equals("Asus")){
                
                sumAsus = sumAsus + comp.getPrice();
                
            }else if(comp.getBrand().equals("Unknown")){
                
                sumUnknown = sumUnknown + comp.getPrice();
            }
                
            
        } 
        
        sumTotal = sumAcer + sumAsus + sumLenovo + sumSony + sumUnknown;
        
        System.out.println("The computers of Sony : "+sumSony);  
        
        System.out.println("The computers of Asus : "+sumAsus);  
        
        System.out.println("The computers of Acer : "+sumAcer);  
        
        System.out.println("The computers of Lenovo : "+sumLenovo);  
        
        System.out.println("The Unknown computers : "+sumUnknown);  
        
        System.out.println("Total Sum: "+sumTotal);
        
        
        System.out.println(Computer.computersCreated);
        
    }
    
}
