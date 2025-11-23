class UpdationHw2
{
	public static void main(String[] args)
	{
		int arr[]={11,22,33,44,55};
		int pos=2;
		int value=333;
		System.out.println("before insert");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+",");
			
		}
		System.out.println();
		UpdationHw2 is=new UpdationHw2();
		int res[]=is.update(arr,pos,value);
		System.out.println("after insert");
		for(int i=0;i<res.length;i++)
		{
		System.out.print(res[i]+",");
			
		}
		
	}
	int[] update(int arr[],int pos,int value)
	{
		arr[pos] = value;   // updating value
        return arr;
	}	
}