class PrincipalAmount
{
	public static void main(String[] args)
	{
		double simpleInterest = 2400; // SI
        double rate = 8;              // R
        double time = 4;              // T
       // Calculate Principal
        double principal = (simpleInterest * 100) / (rate * time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Principal Amount: " + principal);
	}
}