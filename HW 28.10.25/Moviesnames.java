class Moviesnames
{
	public static void main(String[] args)
	{
		String name[];//declaring an array 
	    name=new String[4];//allocating memory for integers
		name[0]="Vidamuyarchi" ;//initializing the elements of an array
		name[1]= "Dragon" ;
		name[2]= "coolie";
		name[3]= "Good Bad Ugly" ;
		for(int i=0;i<name.length;i++)
		   System.out.println("movie" +" " +":"+name[i]);
		
		
	}
}