import java.awt.*;
import javax.swing.*;

public class TopLevelWindow {
	
	static InputListener mainKeyListener;
	static JLabel textLabel;
	
	private static void createWindow() {
		// Create and setup the window.
		JFrame frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textLabel = new JLabel("Welcome to Dungeoneer!", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea("haha stinky text field", 10, 10);
		textArea.setPreferredSize(new Dimension(300, 300));
		textArea.setLocation(50, 200);
		//frame.getContentPane().add(textArea, BorderLayout.SOUTH);
		frame.addKeyListener(mainKeyListener);
		
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void writeToWindow(String text) {
		textLabel.setText(text);
	}
	
	public static void main(String[] args) {
		createListeners();
		createWindow();
	}

	private static void createListeners() {
		mainKeyListener = new InputListener();
	}
}
