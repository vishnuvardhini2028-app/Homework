class VowelsArray
{
	public static void main(String[] args)
	{
		char vowel[];//declaring an array 
	    vowel=new char[5];//allocating memory for integers
		vowel[0]='a';//initializing the elements of an array
		vowel[1]='e';
		vowel[2]='i';
		vowel[3]='o';
		vowel[4]='u';
		for(int i=0;i<vowel.length;i++)
		   System.out.println("vowel letter" +" "+ i + ":" +vowel[i]);
		
		
	}
}