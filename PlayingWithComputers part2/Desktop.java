package playingwithcomputers2;

/**
 *
 * @author ReMieL
 */
public class Desktop extends Computer {

    private boolean hasExtraLight;

    public Desktop(int price) {
        super("Unknown", price);
    }

    public Desktop(String brand, int price, boolean hasExtraLight) {

        super(brand, price);

        this.hasExtraLight = hasExtraLight;
        setPrice();

    }

    public void setHasExtraLight(boolean hasExtraLight) {
        this.hasExtraLight = hasExtraLight;
    }

    public boolean hasExtraLight() {
        return hasExtraLight;
    }

    @Override
    public void setPrice() {

        if (hasExtraLight == true) {

            this.price = price + 10;
        }

    }  

    public int getPrice() {
        return price;
    }
    
    

    @Override
    public String toString() {
        return "Desktop brand: "+getBrand()+"price:"+getPrice()+ "hasExtraLight=" + hasExtraLight + '}';
    }

    

}
