class Employeesdesigarray
{
	public static void main(String[] args)
	{
		String name[];//declaring an array 
	    name=new String[5];//allocating memory for integers
		name[0]="Software Engineer," ;//initializing the elements of an array
		name[1]= "Data Analyst" ;
		name[2]= "Project Manager";
		name[3]= "HR Manager" ;
		name[4]= " UI/UX Designer" ;
		for(int i=0;i<name.length;i++)
		   System.out.println("Employeedesignation" +" " +":"+name[i]);
		
		
	}
}