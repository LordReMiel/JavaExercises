package playingwithcomputers2;

/**
 *
 * @author ReMieL
 */
public abstract class Computer {

    private String brand;

    protected int price;

    public static int computersCreated;
    
    

    private Computer(int price) {
        
        this.price = price;
        
        computersCreated++;
    }

    public Computer(String brand, int price) {

        this(price);
        this.brand = brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void setPrice();

    public int getPrice() {
        return price;
    }
    
    
    
    
    public void getComputersCreated(){
        
        System.out.println("We have created "+computersCreated+" computers");
    }

    @Override
    public String toString() {
        return "Computer{" + "brand=" + brand + ", price=" + price + '}';
    }
    
   
}