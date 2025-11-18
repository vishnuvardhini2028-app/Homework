class Minrecursion
{
	public static void main(String [] args)
	{
        int ar[] = {10, 25, 7, 98, 45};
        int min = ar[0];
		Minrecursions re=new Minrecursions();
		int res=re.minrec(ar,1);
         System.out.println("Minimum = " +res);
		
		
	}
}