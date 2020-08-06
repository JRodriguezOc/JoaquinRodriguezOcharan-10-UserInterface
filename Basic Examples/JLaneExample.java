import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLaneExample extends JFrame{
	public JLaneExample() {
		this.setSize(800, 500);
		componentWindow();
	}
	
	private void componentWindow() {
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		
		JLabel str = new JLabel("Hello World");
		panel.add(str);
	}
		
	public static void main(String[] args) {
		JLaneExample window = new JLaneExample();
			window.setVisible(true);

	}
}
