package playingwithcomputers2;

/**
 *
 * @author ReMieL
 */
public class Tablet extends Computer {

    private boolean hasBluetooh;

    
    public Tablet(int price) {
        super("Unknown", price);
    }

    public Tablet(String brand, int price, boolean hasBluetooh) {

        super(brand, price);

        this.hasBluetooh = hasBluetooh;
        setPrice();

    }

    

    public void setHasBluetooh(boolean hasBluetooh) {
        this.hasBluetooh = hasBluetooh;
    }

    public boolean hasBluetooh() {
        return hasBluetooh;
    }

    @Override
    public void setPrice() {

        if (hasBluetooh == true) {

            super.price = price + 5;
        }
    }

}
