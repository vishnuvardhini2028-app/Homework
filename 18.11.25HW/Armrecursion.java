class Armrecursion
{
	public static void main(String [] args)
	{
		int a=153;
		Armrecursions re= new Armrecursions();
		int result=re.armrec(a,0);
	    if(result == a)
		
            System.out.println(a + " is an Armstrong number");
			
        else
		
            System.out.println(a + " is not an Armstrong number");
		
	}
}