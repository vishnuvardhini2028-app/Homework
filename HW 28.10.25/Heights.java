class Heights
{
	public static void main(String[] args)
	{
		float height[];//declaring an array 
	    height=new float[5];//allocating memory for integers
		height[0]=1.75f;//initializing the elements of an array
		height[1]=1.68f;
		height[2]=1.80f;
		height[3]=1.55f;
		height[4]=1.65f;
		for(int i=0;i<height.length;i++)
		{
	        System.out.println("People height " + i + ":" + height[i]); 
		}
		
	}
}