import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class GUIFrame extends JFrame {
		private int width;
		private int height;
		private JButton button;
		private Listen pos1;
		
		public GUIFrame(int w, int h) {
			width = w;
			width = h;
			button = new JButton("click");
			pos1 = new Listen();
	}
		public void setUpGUI() {
			setSize(width, height);
			setTitle("??");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			add(button);
			button.addActionListener(pos1);
			setVisible(true);
	}
		
		private class Listen implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent str) {
				System.out.println("Button Clicked");
		
		}
	}
}
