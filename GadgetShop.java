import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * GadgetShop GUI class.
 * Stores gadgets in an ArrayList.
 */

public class GadgetShop implements ActionListener{
    
    private ArrayList<Gadget> gadgets;

    private JFrame frame;

    // Text fields
    
    private JTextField modelField;
    private JTextField priceField;
    private JTextField weightField;
    private JTextField sizeField;
    private JTextField creditField;
    private JTextField memoryField;
    private JTextField phoneNumberField;
    private JTextField durationField;
    private JTextField downloadSizeField;
    private JTextField displayNumberField;

    // Buttons
    
    private JButton addMobileButton;
    private JButton addMP3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton makeCallButton;
    private JButton downloadMusicButton;

    public GadgetShop()
    {
        gadgets = new ArrayList<Gadget>();

        frame = new JFrame("Gadget Shop");
        frame.setSize(600, 500);
        frame.setLayout(new GridLayout(12, 2));

        // Create text fields
        
        modelField = new JTextField();
        priceField = new JTextField();
        weightField = new JTextField();
        sizeField = new JTextField();
        creditField = new JTextField();
        memoryField = new JTextField();
        phoneNumberField = new JTextField();
        durationField = new JTextField();
        downloadSizeField = new JTextField();
        displayNumberField = new JTextField();

        // Add labels + fields
        
        frame.add(new JLabel("Model:")); frame.add(modelField);
        frame.add(new JLabel("Price:")); frame.add(priceField);
        frame.add(new JLabel("Weight:")); frame.add(weightField);
        frame.add(new JLabel("Size:")); frame.add(sizeField);
        frame.add(new JLabel("Initial Credit:")); frame.add(creditField);
        frame.add(new JLabel("Initial Memory:")); frame.add(memoryField);
        frame.add(new JLabel("Phone Number:")); frame.add(phoneNumberField);
        frame.add(new JLabel("Duration:")); frame.add(durationField);
        frame.add(new JLabel("Download Size:")); frame.add(downloadSizeField);
        frame.add(new JLabel("Display Number:")); frame.add(displayNumberField);

        // Buttons
        
        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        clearButton = new JButton("Clear");
        displayAllButton = new JButton("Display All");
        makeCallButton = new JButton("Make A Call");
        downloadMusicButton = new JButton("Download Music");

        frame.add(addMobileButton);
        frame.add(addMP3Button);
        frame.add(clearButton);
        frame.add(displayAllButton);
        frame.add(makeCallButton);
        frame.add(downloadMusicButton);

        // Add listeners
        
        addMobileButton.addActionListener(this);
        addMP3Button.addActionListener(this);
        clearButton.addActionListener(this);
        displayAllButton.addActionListener(this);
        makeCallButton.addActionListener(this);
        downloadMusicButton.addActionListener(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Getters for fields

    private String getModel() {
        return modelField.getText().trim(); }
        
    private String getSize() 
    { return sizeField.getText().trim(); }
    
    private String getPhoneNumber() 
    { return phoneNumberField.getText().trim(); }

    private double getPrice() {
        
        try {
            
            String text = priceField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter a price!"); return -1; }
                
            double price = Double.parseDouble(text);
            
            if(price < 0) { 
                JOptionPane.showMessageDialog(frame, "Price must be positive!"); return -1; }
                
            return price;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid price! Enter a number.");
            
            return -1;
        }
    }

    private int getWeight() {
        
        try {
            
            String text = weightField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter a weight!"); return -1; }
                
            int weight = Integer.parseInt(text);
            
            if(weight < 0) { 
                JOptionPane.showMessageDialog(frame, "Weight must be positive!"); return -1; }
                
            return weight;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid weight! Enter a whole number.");
            
            return -1;
        }
    }

    private int getCredit() {
        
        try {
            
            String text = creditField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter credit!"); return -1; }
                
            int credit = Integer.parseInt(text);
            
            if(credit < 0) { 
                JOptionPane.showMessageDialog(frame, "Credit must be positive!"); return -1; }
                
            return credit;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid credit! Enter a whole number.");
            
            return -1;
        }
    }

    private int getMemory() {
        
        try {
            
            String text = memoryField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter memory!"); return -1; }
                
            int memory = Integer.parseInt(text);
            
            if(memory < 0) { 
                JOptionPane.showMessageDialog(frame, "Memory must be positive!"); return -1; }
                
            return memory;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid memory! Enter a whole number.");
            
            return -1;
        }
    }

    private int getDuration() {
        
        try {
            
            String text = durationField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter duration!"); return -1; }
                
            int duration = Integer.parseInt(text);
            
            if(duration < 0) { 
                JOptionPane.showMessageDialog(frame, "Duration must be positive!"); return -1; }
                
            return duration;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid duration! Enter a whole number.");
            
            return -1;
        }
    }

    private int getDownloadSize() {
        
        try {
            
            String text = downloadSizeField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter download size!"); return -1; }
                
            int size = Integer.parseInt(text);
            
            if(size < 0) { 
                JOptionPane.showMessageDialog(frame, "Download size must be positive!"); return -1; }
                
            return size;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid download size! Enter a whole number.");
            
            return -1;
        }
    }

    private int getDisplayNumber() {
        
        int displayNumber = -1;
        
        try {
            
            String text = displayNumberField.getText().trim();
            
            if(text.isEmpty()) { 
                JOptionPane.showMessageDialog(frame, "Please enter display number!"); return -1; }
                
            int input = Integer.parseInt(text);
            
            if(input >= 0 && input < gadgets.size()) {
                displayNumber = input;
                
            } else {
                JOptionPane.showMessageDialog(frame, "Display number out of range.");
            }
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Display number must be an integer.");
        }
        return displayNumber;
    }

    //Buttons

    public void actionPerformed(ActionEvent e)
    {
        // Add Mobile
        
        if(e.getSource() == addMobileButton) {
            
            double price = getPrice();
            int weight = getWeight();
            int credit = getCredit();
            if(price == -1 || weight == -1 || credit == -1) return;

            Mobile m = new Mobile(getModel(), price, weight, getSize(), credit);
            gadgets.add(m);
            JOptionPane.showMessageDialog(frame, "Mobile added successfully!");
        }

        // Add MP3
        
        if(e.getSource() == addMP3Button) {
            
            double price = getPrice();
            int weight = getWeight();
            int memory = getMemory();
            if(price == -1 || weight == -1 || memory == -1) return;

            MP3 mp3 = new MP3(getModel(), price, weight, getSize(), memory);
            gadgets.add(mp3);
            JOptionPane.showMessageDialog(frame, "MP3 added successfully!");
        }

        // Clear fields
        
        if(e.getSource() == clearButton) {
            
            modelField.setText("");
            priceField.setText("");
            weightField.setText("");
            sizeField.setText("");
            creditField.setText("");
            memoryField.setText("");
            phoneNumberField.setText("");
            durationField.setText("");
            downloadSizeField.setText("");
            displayNumberField.setText("");
        }

        // Display all
        
        if(e.getSource() == displayAllButton) {
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < gadgets.size(); i++) {
                
                sb.append("Gadget #").append(i).append("\n");
                sb.append(gadgets.get(i).display()).append("\n\n");
            }
            
            JOptionPane.showMessageDialog(frame, sb.toString());
        }

        // Make a Call
        
        if(e.getSource() == makeCallButton) {
            
            int index = getDisplayNumber();
            int duration = getDuration();
            if(index == -1 || duration == -1) return;

            Gadget g = gadgets.get(index);
            if(g instanceof Mobile) {
                
                Mobile m = (Mobile) g;
                m.makeCall(getPhoneNumber(), duration);
            } else {
                JOptionPane.showMessageDialog(frame, "Selected gadget is not a Mobile!");
            }
        }

        // Download Music
        
        if(e.getSource() == downloadMusicButton) {
            
            int index = getDisplayNumber();
            int size = getDownloadSize();
            if(index == -1 || size == -1) return;

            Gadget g = gadgets.get(index);
            if(g instanceof MP3) {
                
                MP3 mp3 = (MP3) g;
                mp3.downloadMusic(size);
            } else {
                JOptionPane.showMessageDialog(frame, "Selected gadget is not an MP3!");
            }
        }
    }

    public static void main(String[] args) {
        
        new GadgetShop();
    }
}