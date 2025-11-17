class CountOccurrences
{

    // Function to find first occurrence of target
            static int firstOccurrence(int arr[], int target) 
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
                end = mid - 1;  // search left side
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

        // Function to find last occurrence of target
            static  int lastOccurrence(int arr[], int target) 
		{
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;  // search right side
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args)
	{
        int arr[] = {1, 2, 2, 2, 3, 4};
        int target = 2;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
		int count = last - first + 1;
        System.out.println("Count = " + count);
        
    }
}
