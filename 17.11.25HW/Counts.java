class Counts
 {
    public static void main(String[] args)
	{
        int ar[] = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int count = 0;  

        for(int i = 0; i < ar.length; i++) 
		{
            if(ar[i] == target) 
			{
                count++;
            }
        }

        System.out.println(  target );
        System.out.println(  count );
		
    }
}
