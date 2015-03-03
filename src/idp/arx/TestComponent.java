package arx;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class TestComponent {
	
	private final Composite root;

	public TestComponent(Composite parent, int style) {

		checkStyle(style);
		root = new Composite(parent, style);
		root.setLayout(new FillLayout());
		
		Button button1 = new Button(root, SWT.PUSH);
		button1.setText("Button");
	}

	private void checkStyle(int style) {
		// Überprüfen, ob style korrekt ist
		if ((style & SWT.BORDER) != 0) {
			throw new SWTException("Borders are not supported");
		}
	}

	public void setLayoutData(Object arg0) {
		root.setLayoutData(arg0);
	}

	
}
