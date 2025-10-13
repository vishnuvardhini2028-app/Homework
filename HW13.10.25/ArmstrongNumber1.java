class ArmstrongNumber1
{
	public static void main(String[] args)
	{
		int a=1634;
		int b=a;
		int c=a%10;//4
		int d=a/10;//163
		int e=d%10;//3
		int f=d/10;//16
		int g=f/10;//1
		int h=f%10;//6
		int i=(g*g*g*g)+(h*h*h*h)+(e*e*e*e)+(c*c*c*c);
		boolean j=i==b;
		System.out.println(j);
		
	}
}