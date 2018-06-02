package tutorial;

public class counter {

	public static int count;
	
	public counter()
	{
		count++;
	}
	
	
	public static void setZero ()
	{
		count = 0;
	}
	
	/*
	public static void increaseByOne()
	{
		count++;
	}
	
	public static void decreaseByOne()
	{
		if (count > 0)
			count--;
	}
	*/
	
	public static int getCount()
	{
		return count;
	}
	
}
