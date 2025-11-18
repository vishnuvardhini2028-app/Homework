class Reverserecur
{
	public static void main(String [] args)
	{
        int[] arr = {1, 2, 3, 4, 5, 6};
		Reverserecurs rec = new Reverserecurs();
        int res=rec.revrec(arr, arr.length - 1);
        System.out.print( res);
 
	}
}