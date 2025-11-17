class FirstLastPosition 
{

    // Find first occurrence of target
    static int firstOccurrence(int arr[], int target) 
	{
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) 
		{
            int mid = (start + end) / 2;

            if (arr[mid] == target) 
			{
                result = mid;    
                end = mid - 1; //move left    
            } 
			else if (arr[mid] < target) 
			{
                start = mid + 1;
            } 
			else
				{
                end = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence of target
    static int lastOccurrence(int arr[], int target) 
	{
        int start = 0;
		int end = arr.length - 1;
        int result = -1;

        while (start <= end)
			{
            int mid = (start + end) / 2;

            if (arr[mid] == target) 
			{
                result = mid;     
                start = mid + 1;   // move right
            } 
			else if (arr[mid] < target) 
			{
                start = mid + 1;
            } 
			else 
			{
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args)
	{
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        int ans[] = {first, last};

        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
