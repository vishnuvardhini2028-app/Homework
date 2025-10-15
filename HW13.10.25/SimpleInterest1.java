class SimpleInterest1
{
	public static void main(String[] args)
	{
		double principal = 5000; // P
        double rate = 5;         // R
        double time = 2;         // T
       // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal (P): " + principal);
        System.out.println("Rate of Interest (R): " + rate + "%");
        System.out.println("Time (T): " + time + " years");
        System.out.println("Simple Interest (SI): " + simpleInterest);
	}
}