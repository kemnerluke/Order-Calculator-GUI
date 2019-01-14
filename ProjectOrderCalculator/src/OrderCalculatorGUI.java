

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OrderCalculatorGUI extends JFrame{
	private BagelPanel bagel;
	private ToppingPanel toppings;
	private CoffeePanel coffee;
	private GreetingsPanel greeting;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	private final double taxRate=0.06;
	
	
	OrderCalculatorGUI(){
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creates a border layout manager
		setLayout(new BorderLayout());
		
		//creates object from the custom panels
		bagel = new BagelPanel();
		toppings= new ToppingPanel();
		coffee= new CoffeePanel();
		greeting= new GreetingsPanel();
		
		//create build button panel
		buildButtonPanel();
		
		add(greeting,BorderLayout.NORTH);
		add(bagel,BorderLayout.WEST);
		add(toppings,BorderLayout.CENTER);
		add(coffee,BorderLayout.EAST);
		add(buttonPanel,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);




	}
	
	
	private void buildButtonPanel(){
		//creates a panel for the buttons
		buttonPanel = new JPanel();
		
		//creates the buttons
		calcButton= new JButton("Calculate");
		exitButton= new JButton("Exit");
		
		
		//registers the buttons with the action listener
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
		
		
		
		//add buttons to panel
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	private class calcButtonListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			double subtotal=bagel.getBagelCost()+toppings.getToppingCost()+coffee.getCoffeeCost();
			
			double tax= subtotal * taxRate;
			
			double total =subtotal+tax;
			
			JOptionPane.showMessageDialog(null, "Subtotal:"+subtotal+'\n'+"Tax:"+ tax+'\n'+ "Total"+total);
		
		
	}
	}
private class exitButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
System.exit(0);		

	}
}
			
	public static void main(String[] args) {
		new OrderCalculatorGUI();
	}
}

 

