class CelsiusToFahrenheit
{
	public static void main(String [] args)
	{
		CelsiusToFahrenheit cel=new CelsiusToFahrenheit();
		double celsius = 37.0;
		double fahrenheit = cel.fah(celsius);
		System.out.println(celsius + "°C = " + fahrenheit + "°F");
	}
	double fah(double celsius)
	{
		double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
	}
}