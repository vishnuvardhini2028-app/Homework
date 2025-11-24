class Item
{
	public static void main(String [] args)
	{
		Items f1=new Items();
		f1.food= "tea";
		f1.productid= 1;
		f1.productamount= 15;
		
		Items f2=new Items();
		f2.food= "cofee";
		f2.productid= 2;
		f2.productamount= 20;
		
		Items f3=new Items();
		f3.food= "Black cofee";
		f3.productid= 3;
		f3.productamount= 25;
		
		f1.foods();
		f2.foods();
		f3.foods();
		
		
		
		
	}
}