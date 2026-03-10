import javax.swing.JOptionPane;

/**
 * The Mobile class extends Gadget.
 * It represents a mobile phone with calling credit.
 */

public class Mobile extends Gadget {
    
    private int credit;

    public Mobile(String model, double price, int weight, String size, int credit) {
        
        super(model, price, weight, size);
        this.credit = credit;
    }

    public int getCredit() { 
        
        return credit; }

    public void addCredit(int amount) {
        
        if(amount > 0) credit += amount;
        
        else System.out.println("Enter a positive amount.");
    }

    public void makeCall(String number, int duration) {
        
        if(duration <= credit) {
            
            credit -= duration;
            JOptionPane.showMessageDialog(null, "Call made to " + number + " for " + duration + " minutes.\nRemaining credit: " + credit);
        } else {
            
            JOptionPane.showMessageDialog(null, "Insufficient credit to make the call!");
        }
    }

    @Override
    public String display() {
        
        return super.display() + "\nCalling Credit: " + credit + " minutes";
    }
}