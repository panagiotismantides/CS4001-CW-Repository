import javax.swing.JOptionPane;

/**
 * The MP3 class extends Gadget.
 * It represents an MP3 player with available memory.
 */

public class MP3 extends Gadget {
    
    private int memory;

    public MP3(String model, double price, int weight, String size, int memory) {
        
        super(model, price, weight, size);
        this.memory = memory;
    }

    public int getMemory() { 
        
        return memory; }

    public void downloadMusic(int size) {
        
        if(size <= memory) {
            
            memory -= size;
            JOptionPane.showMessageDialog(null, "Downloaded " + size + "MB.\nRemaining memory: " + memory + "MB");
        } else {
            
            JOptionPane.showMessageDialog(null, "Not enough memory!");
        }
    }

    public void deleteMusic(int size) {
        
        memory += size;
    }

    @Override
    public String display() {
        
        return super.display() + "\nAvailable Memory: " + memory + " MB";
    }
}