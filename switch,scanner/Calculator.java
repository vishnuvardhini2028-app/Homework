import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Select the shape to calculate area:");
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
		double area;
		switch(choice)
		{
		case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + area);
                break;

            case 2:
                System.out.print("Enter side length of the square: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square = " + area);
                break;

            case 3:
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of Rectangle = " + area);
                break;

            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle = " + area);
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
        	
		}
	}
}