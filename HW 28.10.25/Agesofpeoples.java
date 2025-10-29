class Agesofpeoples
{
	public static void main(String[] args)
	{
		int age[];//declaring an array 
	    age=new int[5];//allocating memory for integers
		age[0]=24;//initializing the elements of an array
		age[1]=30;
		age[2]=18;
		age[3]=45;
		age[4]=50;
		for(int i=0;i<age.length;i++)
		   System.out.println("people age" + i +":"+age[i]);
		
		
	}
}