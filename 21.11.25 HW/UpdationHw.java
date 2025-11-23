class UpdationHw
{
	public static void main(String[] args)
	{
		int arr[]={2,4,6,8,10};
		int pos=3;
		int value=99;
		System.out.println("before insert");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+",");
			
		}
		System.out.println();
		UpdationHw is=new UpdationHw();
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