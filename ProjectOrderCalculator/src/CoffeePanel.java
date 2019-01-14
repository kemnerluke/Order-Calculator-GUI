import java.awt.*;
import javax.swing.*;

import javafx.scene.control.RadioButton;

public class CoffeePanel extends JPanel{
	
	public final double none = 0.0;
	public final double reg = 1.25;
	public final double decaf = 1.25;
	public final double cap = 2.00;
	
	private JRadioButton NONE;
	private JRadioButton REGULAR;
	private JRadioButton DECAF_COFFEE;
	private JRadioButton CAP;
	
	private ButtonGroup bg1;


	CoffeePanel(){
		setLayout(new GridLayout(4, 1));
		
		
		NONE= new JRadioButton("None");
		REGULAR= new JRadioButton("Regular");
		DECAF_COFFEE= new JRadioButton("Decaf");
		CAP= new JRadioButton("Cappuccino");		
		
		bg1=new ButtonGroup();
		
		//grouping buttons to buttongroup
		bg1.add(NONE);
		bg1.add(REGULAR);
		bg1.add(DECAF_COFFEE);
		bg1.add(CAP);



		setBorder(BorderFactory.createTitledBorder("Coffee"));
		//then adding to panel
		add(NONE);
		add(REGULAR);
		add(DECAF_COFFEE);
		add(CAP);

		
	}
	public final double getCoffeeCost() {
		//set initial coffee cost to zero. once coffee is selected it updates the respective price. used if with else if ladder so only one price can be chosen
		double CoffeeCost= 0.0;
		if(NONE.isSelected())
			CoffeeCost=none;
		else if(REGULAR.isSelected())
			CoffeeCost=reg;
		else if(DECAF_COFFEE.isSelected())
			CoffeeCost=decaf;
		else if(CAP.isSelected())
			CoffeeCost=cap;
		return CoffeeCost;
	}
}
