
package collections;
import java.util.ArrayList;
import java.util.Scanner;


public class AcerLaptop 
{
    
 
    String model;
    String colour;
    boolean rgbKeyboard;
    String processor;
    double price;

    AcerLaptop(String model, String colour, boolean rgbKeyboard, String processor, double price) {
        this.model = model;
        this.colour = colour;
        this.rgbKeyboard = rgbKeyboard;
        this.processor = processor;
        this.price = price;
    }

    
    void display() {
        System.out.println("Model       : " + model);
        System.out.println("Colour      : " + colour);
        System.out.println("RGB Keyboard: " + rgbKeyboard);
        System.out.println("Processor   : " + processor);
        System.out.println("Price       : " + price);
    }
 

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<AcerLaptop> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1 for Entry  2 for Search  3 for Exit");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) 
            {
                System.out.println("Enter the model of laptop");
                String model = sc.nextLine();

                System.out.println("Color of the laptop");
                String colour = sc.nextLine();

                System.out.println("Its is rgb keyboard (True/False)");
                boolean rgb = sc.nextBoolean();
                sc.nextLine();

                System.out.println("Processor");
                String processor = sc.nextLine();

                System.out.println("Price");
                double price = sc.nextDouble();

                list.add(new AcerLaptop(model, colour, rgb, processor, price));
                System.out.println("Laptop details added successfully!");

            } else if (choice == 2) 
            {
                sc.nextLine();
                System.out.println("Enter model to search");
                String searchModel = sc.nextLine();

                boolean found = false;
                for (AcerLaptop a : list) {
                    if (a.model.equalsIgnoreCase(searchModel)) 
                    {
                        a.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Laptop not found");
                }
            }

        } while (choice != 3);
    }
}


