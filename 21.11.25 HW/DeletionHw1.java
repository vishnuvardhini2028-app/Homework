class DeletionHw1
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		int pos=2;
		System.out.println("before insert");
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+", ");
			
		}
		System.out.println();
		DeletionHw1 is=new DeletionHw1();
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