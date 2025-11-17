class Missingnumbers
{
	public static void main(String[] args)
	{
		int ar[]={1,2,4,6,3,7,8};
		int sum=0;
		int n=ar.length+1;
		int sums=n*(n+1)/2;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			System.out.println(sum+" ");
		}
		int missingnum=sums-sum;
        System.out.println("missingnum is"+missingnum);
		
	}
}