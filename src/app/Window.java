package app;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.*;

public class Window extends JFrame{
JPanel input;
JPanel output;
JPanel title;
JPanel bottom;

JTextField inputField;
JTextField outputField;

JLabel inputLabel;
JLabel outputLabel;
JLabel Title;

JButton press;
JLabel next;
JLabel instructions;

Window(String string){
super(string);

setSize(700, 300);	
	input = new JPanel();
	output = new JPanel();
	title = new JPanel();
	bottom = new JPanel();
	

	press = new JButton("Enter");
	press.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
    	inputField.setText("");
	outputField.setText("");
	try {
            Thread.sleep(1000);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
	outputField.setText(""+new Random().nextInt(9));
  }
});
	instructions = new JLabel("Instructions: enter number, press button, find pattern");

	inputLabel = new JLabel("INPUT");
	outputLabel = new JLabel("OUTPUT");
	Title = new JLabel("Find the pattern!");
	Title.setFont(new Font("Serif", Font.PLAIN, 35));
	inputField = new JTextField(10);
	outputField = new JTextField(10);
	outputField.setEditable(false);

	title.add(Title);
	
	input.add(inputLabel);
	input.add(inputField);
	input.add(press);

	output.add(outputLabel);
	output.add(outputField);
	
	

	add(title, BorderLayout.PAGE_START);
	add(input, BorderLayout.LINE_START);
	add(output, BorderLayout.LINE_END);
	bottom.add(instructions, BorderLayout.PAGE_START);
	
	add(bottom, BorderLayout.PAGE_END);
	getRootPane().setDefaultButton(press);
	setVisible(true);
}


}
