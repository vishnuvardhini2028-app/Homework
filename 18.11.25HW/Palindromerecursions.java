class Palindromerecursions
{
	int palirec(int a,int sum)
	{
		
			if(a == 0)
			
               return sum;

              int rem = a % 10;
			  sum=rem+(sum*10);
              
            
             return palirec(a / 10, sum);
			
		
	}
}