class Positivenegativearrayfun
{
	public static void main(String [] args)
	{
	  int[] ar={12, 18, -2, -36, 45, -21, 1};
	  Positivenegativearrayfun positive=new Positivenegativearrayfun();
	  int p=positive.num(ar);
	  
	}
	int num(int[] ar)
	{   
	  for (int i = 0; i < ar.length; i++)  
		if(ar[i]>0)
		{
			System.out.println("the given number is positive" +ar[i]);
		}
		else if(ar[i]<0)
		{
			System.out.println("the given number is negative" +ar[i]);
			
		}
		else
		{
			System.out.println("the given number is zero" +ar[i]);
			
		}return 0;
	}
	
}