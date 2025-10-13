class ArmstrongNumber2
{
	public static void main(String[] args)
	{
		int a=12;
		int b=a;
		int c=a%10;//2
		int d=a/10;//1
		int e=(d*d)+(c*c);
		boolean f=e==b;
		System.out.println(f);
	}
}