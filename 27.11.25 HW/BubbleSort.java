
package SortingStrategy;

import java.util.Arrays;


public class BubbleSort implements  SortStrategy
{
     @Override
    public void sort(int[] arr) 
    {
       for(int i = 0; i < arr.length - 1; i++) 
		{
            for(int j = 0; j < arr.length - 1 - i; j++) 
			{
                if(arr[j] > arr[j + 1]) 
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                                }
            }
        }
        System.out.println("Array sorted using Bubble sort:"+Arrays.toString(arr));
        
    }

    

    
    
}
