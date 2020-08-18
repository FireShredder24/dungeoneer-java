import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener {

	@SuppressWarnings("static-access")
	@Override
	public void keyPressed(KeyEvent arg0) {
			TopLevelWindow.writeToWindow("you just pressed " + arg0.getKeyText(arg0.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
