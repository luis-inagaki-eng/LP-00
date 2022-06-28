import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class mainControles extends JPanel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		JFrame frame = new JFrame("Plot infectados");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controles calc_infectados = new controles(1);	
		frame.add(calc_infectados);
		frame.setSize(500,500);
		frame.setVisible(true);		

	}

}
