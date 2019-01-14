import java.awt.*;
import javax.swing.*;

public class BagelPanel extends JPanel {

	public final double WHITE_BAGEL =1.25;
	public final double WHEAT_BAGEL=1.50;
	
	
	
	private JRadioButton white;
	private JRadioButton wheat;
	
	private ButtonGroup bg;
	
	
	BagelPanel(){
		setLayout(new GridLayout(2, 1));
		
		white = new JRadioButton("Wheat");
		wheat = new JRadioButton("White");
		
		bg= new ButtonGroup();
		
		
		//group radio buttons to group
		bg.add(wheat);
		bg.add(white);
		
		
		setBorder(BorderFactory.createTitledBorder("Bagels"));
		
		//adding the radio buttons to the panel
		add(wheat);
		add(white);
		
		
		
	}
	public final double getBagelCost() {
		//bagel cost initially set to zero once a bagel type is selected it updates the price
		
		double bagelcost=0.0;
		
		if(white.isSelected())
				bagelcost=WHEAT_BAGEL;
		else bagelcost=WHITE_BAGEL;
		return bagelcost;
		
	}
}
