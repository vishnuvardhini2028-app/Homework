class Palindromerecursion
{
	public static void main(String [] args)
	{
		int a=1221;
		Palindromerecursions re= new Palindromerecursions();
		int result=re.palirec(a,0);
	    if(result == a)
		{
		
            System.out.println(a + " is an palindrome number");
		}	
        else
		{
            System.out.println(a + " is not an palindrome number");
		}
	}
}