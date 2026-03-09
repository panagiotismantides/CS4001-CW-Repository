/**
 * The MP3 class extends Gadget.
 * It represents an MP3 player with available memory.
 */

public class MP3 extends Gadget

{
    // Single attribute
    
    private int memory;

    //Constructor.
     
    public MP3(String model, double price, int weight, String size, int memory)
    
    {
        super(model, price, weight, size);
        this.memory = memory;
    }

    public int getMemory()
    
    {
        return memory;
    }

    //Downloads music if enough memory exists.
    
    public void downloadMusic(int amount)
    
    {
        if (amount <= memory)
        
        {
            memory -= amount;
            System.out.println("Music downloaded.");
        }
        else
        {
            System.out.println("Not enough available memory.");
        }
    }

    //Deletes music and restores memory.
    
    public void deleteMusic(int amount)
    
    {
        memory += amount;
    }

    //Displays MP3 details.
    
    public void display()
    
    {
        super.display();
        System.out.println("Available Memory: " + memory + " MB");
    }
}