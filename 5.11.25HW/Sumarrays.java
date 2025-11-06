class Sumarrays
{
	public static void main(String[] args)
	{
	   int ar[]={13,26,5,20,13,7};
       Sumarrays sa=new Sumarrays();
	   int res=sa.add(ar);
	   System.out.println(res);
       	   
	}
	int add(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	
}