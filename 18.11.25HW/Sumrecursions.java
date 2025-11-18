class Sumrecursions
{
	int rec(int ar[],int i)
	{
		if (i==ar.length)
		{
			return 0;
		}
		return ar[i]+rec(ar,i+1);
	}
	
}