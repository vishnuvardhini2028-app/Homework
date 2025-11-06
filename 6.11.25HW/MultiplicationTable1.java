class MultiplicationTable1
{
	public static void main(String [] args)
	{
		MultiplicationTable1 mul=new MultiplicationTable1();
		 mul.tab();
	}
	int tab()
	{
		for (int i = 1; i <= 16; i++) 
		{
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) 
			{
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Blank line between tables
		}return 0;	
	}
}