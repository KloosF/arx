package arx;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Test {
	 public static void main(String[] args) {
		 
		    Display display = new Display();
		    Shell shell = new Shell(display);
		    shell.setText("Masking GUI");
		    shell.setSize(1024, 768);
		    shell.setLayout(new FillLayout());
		    
		    Composite root = new Composite(shell, SWT.NONE);
		    root.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());
		    
		    for(int i=0;i<9; i++) {
		    	TestComponent component = new TestComponent(root, SWT.NONE);
		    	component.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		    }
		    
		    shell.open();
		    while (!shell.isDisposed()) {
		      if (!display.readAndDispatch())
		        display.sleep();
		    }
		    display.dispose();
		  }
}
