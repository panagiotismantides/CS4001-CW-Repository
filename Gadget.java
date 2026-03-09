/**
 * The Gadget class represents a gadget in general.
 * It stores the model, price, weight and size.
 */

public class Gadget

{
    // Attributes
    
    private String model;
    private double price;
    private int weight;
    private String size;

    //Constructor to initialise all attributes.
    
    public Gadget(String model, double price, int weight, String size)
    
    {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    // Accessor methods
    
    public String getModel()
    
    {
        return model;
    }

    public double getPrice()
    
    {
        return price;
    }

    public int getWeight()
    
    {
        return weight;
    }

    public String getSize()
    
    {
        return size;
    }
    
     //Displays the details of the gadget.
     
    public void display()
    
    {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
    }
}