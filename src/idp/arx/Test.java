package arx;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Test {
	 public static void main(String[] args) {
		    Display display = new Display();
		    Shell shell = new Shell(display);
		    shell.setText("My First SWT GUI");
		    shell.setSize(200, 100);

		    Text helloText = new Text(shell, SWT.CENTER);
		    helloText.setText("Hello SWT!");
		    helloText.setBounds(47, 20, 100, 20);

		    shell.open();
		    while (!shell.isDisposed()) {
		      if (!display.readAndDispatch())
		        display.sleep();
		    }
		    display.dispose();
		  }
}
