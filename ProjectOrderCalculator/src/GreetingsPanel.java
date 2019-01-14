import javax.swing.*;

public class GreetingsPanel extends JPanel{
private JLabel greeting;

		GreetingsPanel(){
			//creating the label
			greeting=new JLabel("Welcome To Brandi Bagel Shop");
			
			
			//add method from available in Jpanel adding the label to the panel itself
			add(greeting);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
