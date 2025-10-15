class SimpleInterest2
{
	public static void main(String[] args)
	{
		double principal = 50000; // P
        double rate = 6;          // R
        double time = 5;          // T
		// Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
		// Calculate Total Amount
        double totalAmount = principal + simpleInterest;
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: ₹" + simpleInterest);
        System.out.println("Total Balance after " + time + " years: " + totalAmount);
	}
}