import javax.swing.*;
import java.awt.*;

public class ToppingPanel extends JPanel {

	public final double CREAM_CHEESE = 0.50;
	public final double BUTTER = 0.25;
	public final double PEACH_JELLY=0.75;
	public final double BLUEBERRY_JAM=0.75;
	
	private JCheckBox creamcheese;
	private JCheckBox butter;
	private JCheckBox peachjelly;
	private JCheckBox blueberryjam;
	
	
	ToppingPanel(){
		setLayout(new GridLayout(4, 1));
		
		//create the check boxes
	  creamcheese= new JCheckBox("Creamcheese");
	  butter= new JCheckBox("Butter");
	  peachjelly= new JCheckBox("Peach jelly");
	  blueberryjam= new JCheckBox("Blueberry jam");
	  
	  setBorder(BorderFactory.createTitledBorder("Toppings"));
	  
	  //add check boxed to panel
	  add(creamcheese);
	  add(butter);
	  add(peachjelly);
	  add(blueberryjam);

	}
public final double getToppingCost(){
	//topping cost initially set to zero once toppings are selected it adds up the price(+=) then updates with the total cost
	double toppingcost=0.0;
	
	if(creamcheese.isSelected()){
		toppingcost =CREAM_CHEESE;
	}
	if(butter.isSelected()){
		toppingcost =BUTTER;
	}
	if(peachjelly.isSelected()){
		toppingcost =PEACH_JELLY;
	}
	if(blueberryjam.isSelected()){
		toppingcost =BLUEBERRY_JAM;
	}
	return toppingcost;
	}


}
