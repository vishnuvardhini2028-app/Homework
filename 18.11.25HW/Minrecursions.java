class Minrecursions
{
	int minrec(int ar[],int i)
	{
		if(i==ar.length-1)
		{
			return ar[i];
		}
		int minRestvalue = minrec(ar, i + 1);
		
		if (ar[i] < minRestvalue)
		{
            return ar[i];
		}
        else
		{
            return minRestvalue;
        }
		//return maxrec(ar,i+1);
	}
}