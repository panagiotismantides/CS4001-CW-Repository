/**
 * The Gadget class represents a gadget in general.
 * It stores the model, price, weight and size.
 */

public class Gadget {
    
    private String model;
    private double price;
    private int weight;
    private String size;

    public Gadget(String model, double price, int weight, String size) {
        
        
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public String getModel() { return model; }
    public double getPrice() { return price; }
    public int getWeight() { return weight; }
    public String getSize() { return size; }

    // Return details as a String instead of printing
    
    public String display() {
        
        return "Model: " + model + "\n" +
               "Price: £" + price + "\n" +
               "Weight: " + weight + "g\n" +
               "Size: " + size;
    }
}