/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).*/

package prg4b;
    import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class CountryButtonDemo extends JFrame implements ActionListener {

	    JButton btnSriLanka, btnIndia;
	    JLabel label;

	    // Constructor
	    CountryButtonDemo() {
	        setTitle("Country Button Demo");
	        setSize(400, 200);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create buttons
	        btnSriLanka = new JButton("Srilanka");
	        btnIndia = new JButton("India");

	        // Create label
	        label = new JLabel("Press a button");

	        // Add ActionListener
	        btnSriLanka.addActionListener(this);
	        btnIndia.addActionListener(this);

	        // Add components to frame
	        add(btnSriLanka);
	        add(btnIndia);
	        add(label);

	        setVisible(true);
	    }

	    // Event handling
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnSriLanka) {
	            label.setText("Srilanka is pressed");
	        } else if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        new CountryButtonDemo();
	    }
	}

