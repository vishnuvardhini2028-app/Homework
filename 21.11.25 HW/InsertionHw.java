class InsertionHw
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int pos=2;
		int value=99;
		System.out.println("before insert");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+",");
			
		}
		System.out.println();
		InsertionHw is=new InsertionHw();
		int res[]=is.insert(arr,pos,value);
		System.out.println("after insert");
		for(int i=0;i<res.length;i++)
		{
		System.out.print(res[i]+",");
			
		}
		
	}
	int[] insert(int arr[],int pos,int value)
	{
		int brr[]=new int[arr.length+1];
		for(int i=0;i<pos-1;i++)
		{
			brr[i]=arr[i];
		}
		brr[pos-1]=value;
		for(int i=pos;i<brr.length;i++)
		{
			brr[i]=arr[i-1];
		}
		return brr;
	}	
}