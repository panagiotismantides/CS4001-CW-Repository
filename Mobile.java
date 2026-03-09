/**
 * The Mobile class extends Gadget.
 * It represents a mobile phone with calling credit.
 */

public class Mobile extends Gadget

{
    // Single attribute
    
    private int credit;

     //Constructor.
     //First 4 parameters go to Gadget constructor.
     
    public Mobile(String model, double price, int weight, String size, int credit)
    
    {
        super(model, price, weight, size);
        this.credit = credit;
    }

    public int getCredit()
    
    {
        return credit;
    }

     //Adds calling credit if positive.
     
    public void addCredit(int amount)
    
    {
        if (amount > 0)
        
        {
            credit += amount;
        }
        else
        {
            System.out.println("Please enter a positive amount.");
        }
    }

    //Makes a call if there is enough credit.
    
    public void makeCall(String phoneNumber, int duration)
    
    {
        if (duration <= credit)
        
        {
            System.out.println("Calling " + phoneNumber + " for " + duration + " minutes.");
            credit -= duration;
        }
        else
        {
            System.out.println("Insufficient credit.");
        }
    }

     //Displays mobile details.
    
    public void display()
    
    {
        super.display();
        System.out.println("Remaining Credit: " + credit + " minutes");
    }
}