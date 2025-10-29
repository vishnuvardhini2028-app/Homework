class Mobilenumbersarray
{
	public static void main(String[] args)
	{
		long num[];//declaring an array 
	    num=new long[4];//allocating memory for integers
		num[0]= 9876543210l;//initializing the elements of an array
		num[1]= 9988776655l;
		num[2]= 9123456789l;
		num[3]= 8899776655l;
		for(int i=0;i<num.length;i++)
		   System.out.println("Number" +" " +":"+num[i]);
		
		
	}
}