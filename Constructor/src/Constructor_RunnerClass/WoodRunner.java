package Constructor_RunnerClass;

import Constructor_class.Window;
import Constructor_class.WoodWindow;

public class WoodRunner {

	public static void main(String[] args) {
	
		Window window=new Window();
		window.open();
		window.close();
		
		System.out.println("_________________________");
		
		WoodWindow wodWindow=new WoodWindow();
		wodWindow.close();
		wodWindow.open();
		wodWindow.semiClose();
		
		System.out.println("_________________________");
		
		Window window1=new WoodWindow();
		window1.open();
		window1.close();
		System.out.println("_________________________");
		
		WoodWindow woodwindow=(WoodWindow)window1;//type Casting-- also called data type casting(Non preemetive inheritance)(converting parent reff to subclss refference)
		woodwindow.close();
		woodwindow.open();
		woodwindow.semiClose();
		
		
		

	}

}
