
package playingwithcomputers2;

/**
 *
 * @author ReMieL
 */
public class Laptop extends Computer{
    
    
    private boolean hasWifi;
    
    
    
    
     public Laptop(int price) {
        super("Unknown",price);
    }
     

    public Laptop(String brand, int price, boolean hasWifi) {
        
        super(brand, price);
        
        this.hasWifi = hasWifi;
        setPrice();
        
    }

   
    
    

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean hasWifi() {
        return hasWifi;
    }
    
    
    

    @Override
    public void setPrice() {
         if ( hasWifi == true){
            
          
           super.price = price+20;
        }
    }
    
}
