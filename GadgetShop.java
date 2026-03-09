import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * GadgetShop GUI class.
 * Stores gadgets in an ArrayList.
 */

public class GadgetShop implements ActionListener

{
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
        frame.setLayout(new GridLayout(12,2));

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

    //Input Methods

    private String getModel() { return modelField.getText(); }
    private String getSize() { return sizeField.getText(); }
    private String getPhoneNumber() { return phoneNumberField.getText(); }

    private double getPrice() { return Double.parseDouble(priceField.getText()); }
    private int getWeight() { return Integer.parseInt(weightField.getText()); }
    private int getCredit() { return Integer.parseInt(creditField.getText()); }
    private int getMemory() { return Integer.parseInt(memoryField.getText()); }
    private int getDuration() { return Integer.parseInt(durationField.getText()); }
    private int getDownloadSize() { return Integer.parseInt(downloadSizeField.getText()); }

    private int getDisplayNumber()
    
    {
        int displayNumber = -1;

        try
        
        {
            int input = Integer.parseInt(displayNumberField.getText());

            if (input >= 0 && input < gadgets.size())
            
            {
                displayNumber = input;
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "Display number out of range.");
            }
        }
        catch(NumberFormatException e)
        
        {
            JOptionPane.showMessageDialog(frame, "Display number must be an integer.");
        }

        return displayNumber;
    }

    //Button Handling

    public void actionPerformed(ActionEvent e)
    
    {
        if (e.getSource() == addMobileButton)
        
        {
            Mobile m = new Mobile(getModel(), getPrice(), getWeight(), getSize(), getCredit());
            gadgets.add(m);
        }

        if (e.getSource() == addMP3Button)
        
        {
            MP3 mp3 = new MP3(getModel(), getPrice(), getWeight(), getSize(), getMemory());
            gadgets.add(mp3);
        }

        if (e.getSource() == clearButton)
        
        {
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

        if (e.getSource() == displayAllButton)
        
        {
            for (int i = 0; i < gadgets.size(); i++)
            
            {
                System.out.println("Display Number: " + i);
                gadgets.get(i).display();
                System.out.println();
            }
        }

        if (e.getSource() == makeCallButton)
        
        {
            int index = getDisplayNumber();

            if (index != -1)
            
            {
                Gadget g = gadgets.get(index);

                if (g instanceof Mobile)
                
                {
                    Mobile m = (Mobile) g;
                    m.makeCall(getPhoneNumber(), getDuration());
                }
            }
        }

        if (e.getSource() == downloadMusicButton)
        
        {
            int index = getDisplayNumber();

            if (index != -1)
            
            {
                Gadget g = gadgets.get(index);

                if (g instanceof MP3)
                
                {
                    MP3 mp3 = (MP3) g;
                    mp3.downloadMusic(getDownloadSize());
                }
            }
        }
    }

    public static void main(String[] args)
    
    {
        new GadgetShop();
    }
}