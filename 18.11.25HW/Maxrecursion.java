class Maxrecursion
{
	public static void main(String [] args)
	{
        int ar[] = {10, 25, 7, 98, 45};
        int max = ar[0];
		Maxrecursions re=new Maxrecursions();
		int res=re.maxrec(ar,1);
         System.out.println("Maximum = " +res);
		
		
	}
}