import javax.swing.JFrame;

public class javaFrameExample extends JFrame{
	public javaFrameExample() {
		this.setSize(400, 400);
	}
	
	public static void main(String[] args) {
		javaFrameExample window = new javaFrameExample();
			window.setVisible(true);
	}
	
}

