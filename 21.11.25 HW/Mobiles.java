class Mobiles
{
	public static void main(String [] args)
	{
		MainMobiles mb1=new MainMobiles();
		mb1.mobilename= "NOTE 8 PRO";
		mb1.mobilebrandname= " MI";
		mb1.mobileamount= 25000;
		mb1.quantity= 1;
		
		MainMobiles mb2=new MainMobiles();
		mb2.mobilename= "16 PRO";
		mb2.mobilebrandname= " APPLE";
		mb2.mobileamount= 100000;
		mb2.quantity= 1;
		
		MainMobiles mb3=new MainMobiles();
		mb3.mobilename= " S24 ULTRA";
		mb3.mobilebrandname= "SAMSUNG";
		mb3.mobileamount=  150000;
		mb3.quantity= 1;
		
		MainMobiles mb4=new MainMobiles();
		mb4.mobilename= "PHONE 2";
		mb4.mobilebrandname= "NOTHING";
		mb4.mobileamount=  40000;
		mb4.quantity= 1;
		
		mb1.digital();
		mb2.digital();
		mb3.digital();
		mb4.digital();
		
		
	}
	
}