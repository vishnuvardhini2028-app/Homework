class Squarenumbers
{
	public static void main(String [] args)
	{
		Squarenumbers s=new Squarenumbers();
		s.squares(5);
	}
	int squares(int a)
	{
		int c=a*a;
		System.out.println("the square number is:" +c);
		return c;
	}
}