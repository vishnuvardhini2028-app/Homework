class Firstrepeatnum
{
    public static void main(String[] args) 
	{
	int ar[]={10, 5, 3, 4, 3, 5, 6};
	Firstrepeatnum n=new Firstrepeatnum();
	int res=n.fun(ar);
    System.out.print( res);
	
	}
	
	int fun(int ar[])
	{
		for (int i = 0; i < ar.length; i++) 
		{
        for (int j = i + 1; j < ar.length; j++) 
		{
            if (ar[i] == ar[j]) 
			{
                return ar[i];
            }
        }
    }
    return -1;  // No repeating
	}
	
}	