class SimpleInterest3
{
	public static void main(String[] args)
	{
		double principal = 10000; // P
        double rate = 5;          // R
        double time = 3;          // T
       // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
	}
}