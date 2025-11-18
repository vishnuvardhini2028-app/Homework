class Armrecursions
{
	int armrec(int a,int sum)
	{
		
			if(a == 0)
			
               return sum;

              int rem = a % 10;
              sum = sum + (rem * rem * rem);
            
             return armrec(a / 10, sum);
			
		
	}
}