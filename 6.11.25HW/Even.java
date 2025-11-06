class Even
{
	public static void main(String [] args)
	{
		Even e=new Even();
		e.evennum(11);
	}
	int evennum(int a)
	{
		if(a%2==0)
		{
		System.out.println("true");
			
		}
		else
		{
		System.out.println("false");
			
		}
		return a;
	}
}