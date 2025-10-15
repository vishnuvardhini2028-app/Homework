class PrincipalAmount2
{
	public static void main(String[] args)
	{
		double simpleInterest = 3600; // SI
        double rate = 6;              // R
        double time = 3;              // T
        // Calculate Principal
        double principal = (simpleInterest * 100) / (rate * time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Principal Amount: " + principal);
	}
}	
