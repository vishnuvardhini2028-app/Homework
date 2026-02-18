package foodmenu;

import foodmenu.FoodDAO;
import foodmenu.Pojocls;

import java.sql.ResultSet;
import java.util.Scanner;

public class MainFoodmenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        FoodDAO dao = new FoodDAO();

        int choose;

        do {

            System.out.println("************** SMART CANTEEN MENU*************");
            System.out.println("1. Add Food");
            System.out.println("2. View Menu");
            System.out.println("3. Search Food");
            System.out.println("4. Update Price");
            System.out.println("5. Delete Food");
            System.out.println("6. Total Bill");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            
            choose = sc.nextInt();

            try {

                switch (choose) {

                    case 1:
                        System.out.print("f_id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("f_Name: ");
                        String name = sc1.nextLine();

                        System.out.print("f_Price: ");
                        int price = sc.nextInt();

                        Pojocls p1 = new Pojocls(id, name, price);
                        dao.addFood(p1);
                        System.out.println("Food Added!");
                        break;

                    case 2:
                        ResultSet rs = dao.viewFood();
                        System.out.println("ID  NAME  PRICE");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getDouble(3));
                        }
                        break;

                    case 3:
                        
                        System.out.print("Enter Name: ");
                        String sname = sc1.nextLine();

                        ResultSet r = dao.searchFood(sname);

                        if (r.next()) {
                            System.out.println("ID: " + r.getInt(1));
                            System.out.println("Name: " + r.getString(2));
                            System.out.println("Price: " + r.getDouble(3));
                        } else {
                            System.out.println("Not Found!");
                        }
                        break;

                    case 4:
                        System.out.print("ID: ");
                        int uid = sc.nextInt();

                        System.out.print("New Price: ");
                        int nprice = sc1.nextInt();

                        int rows = dao.updatePrice(uid, nprice);

                        if (rows > 0)
                            System.out.println("Updated!");
                        else
                            System.out.println("ID Not Found!");
                        break;

                    case 5:
                        System.out.print("ID: ");
                        int d_id = sc.nextInt();

                        int d = dao.deleteFood(d_id);

                        if (d > 0)
                            System.out.println("Deleted!");
                        else
                            System.out.println("ID Not Found!");
                        break;

                    case 6:
                        System.out.println("Total Bill = " + dao.totalBill());
                        break;

                    case 7:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");

                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        } while (choose != 7);
    }
}
