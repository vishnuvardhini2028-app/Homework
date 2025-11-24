class Variety
{
	public static void main(String [] args)
	{
		Varieties f1=new Varieties();
		f1.food= "idly";
		f1.productId= 1;
		f1.productAmount= 8;
		
		Varieties f2=new Varieties();
		f2.food= "poori";
		f2.productId= 2;
		f2.productAmount= 30;
		
		Varieties f3=new Varieties();
		f3.food= "dosa";
		f3.productId= 3;
		f3.productAmount= 25;
		
		f1.foods();
		f2.foods();
		f3.foods();
	}
}
