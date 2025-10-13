class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int a=153;
		int b=a;
		int c=a%10;//3
		int d=a/10;//15
		int e=d%10;//5
		int f=d/10;//1
		int g=(f*f*f)+(e*e*e)+(c*c*c);
		boolean h=g==b;
		System.out.println(h);
	}
}