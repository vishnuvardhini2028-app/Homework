class Reverserecurs
{
	int revrec(int ar[],int i)
	{
		if(i<0)
		{
			return 0;
		}
		else
		{
			 System.out.print(ar[i]+", ");
		}
		return revrec(ar,i-1);
	}
}