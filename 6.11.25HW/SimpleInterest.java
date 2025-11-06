class SimpleInterest
{
	public static void main(String [] args)
	{
		SimpleInterest i=new SimpleInterest();
		double principal = 10000;  // Principal amount
        double rate = 5;           // Rate of Interest per annum
        double days = 180;         // Number of days

        double SI =i. si(principal, rate, days);

        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "% per annum");
        System.out.println("Number of Days: " + days);
        System.out.println("Simple Interest = " + SI);
	}
	double si(double principal, double rate, double days)
	{
		double years = days / 365;  // Convert days to years
        double si = (principal * rate * years) / 100;
        return si;
	}
}