class Sum
{
	public static void main(String [] args)
	{
		Sum s=new Sum();
		s.add(10,20);
	}
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println("the addition of two numbers is:" +c);
		return c;
	}
}