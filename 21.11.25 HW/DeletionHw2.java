class DeletionHw2
{
	public static void main(String[] args)
	{
		int arr[]={7,14,21,28,35};
		int pos=3;
		System.out.println("before insert");
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+", ");
			
		}
		System.out.println();
		DeletionHw2 is=new DeletionHw2();
		is.delete(arr,pos);
		
		System.out.println("after insert");
		for(int i=0;i<arr.length-1;i++)
		{
		   System.out.print(arr[i]+", ");
			
		}
		
	}
    void delete(int arr[],int pos)
	{
		
		for(int i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
	}
}