class Maxrecursions
{
	int maxrec(int ar[],int i)
	{
		if(i==ar.length-1)
		{
			return ar[i];
		}
		 int maxRestvalue = maxrec(ar, i + 1);
		
		if (ar[i] > maxRestvalue)
			{
            return ar[i];
			}
        else
		{
            return maxRestvalue;
        }
		//return maxrec(ar,i+1);
	}
}