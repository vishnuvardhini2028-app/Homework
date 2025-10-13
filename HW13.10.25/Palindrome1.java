class Palindrome1
{
	public static void main(String[] args)
	{
		int a=121;
		int b=a;
		int c=a%10;//1
		int d=a/10;//12
		int e=d%10;//2
		int f=(c*1)+(e*10)+(c*100);
		boolean g=f==b;
		System.out.println(g);
	}
}