package Constructor_class;

public class WoodWindow  extends Window{
	@Override
	public void open()
	{
		System.out.println("open method is in Woodwindow");
		
	}
	@Override
	public void close()
	{
		System.out.println("close method is in WoodWindow");
	}
	
	public void semiClose()
	{
		System.out.println("semiclose method is in WoodWindow");
	}

}
