class Max
{
	public static void main(String [] args)
	{
	   Max m=new Max();
       int maxnums=m.maxnum(35,80);	
	   System.out.println("The larger number is: " + maxnums);
	}
	int maxnum(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		
	    else
		{
			return b;
			
		}
	}
}