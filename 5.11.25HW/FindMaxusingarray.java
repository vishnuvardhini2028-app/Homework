class FindMaxusingarray
{
	public static void main(String [] args)
	{
	
        int[] numbers = {10, 25, 7, 98, 45};  // sample array

        int max = numbers[0];  // assume first element is max

        for (int i = 1; i < numbers.length; i++) 
		{
            if (numbers[i] > max) 
			{
                max = numbers[i];  // update max if a bigger number is found
            }
        }

        System.out.println("Maximum number = " + max);
	}
}