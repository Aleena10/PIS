
import java.util.*;
public class ProductInventory {
  
 
	    String T_name;
        int P_Id;
        String P_Name;
        String P_Description;
        String P_Quantity;
        int P_price;
        int Exp_date;
       
        public static void main(String[] args){
            new ProductInventory().Getdetails();
           
        }
        public void Getdetails()
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Welcome to product inventory system:");
            System.out.println("-------------------------------------");
            System.out.println("Enter the name of the product:");
            P_Name=scan.next();
            P_Description=scan.nextLine();
            System.out.println("Enter product description:");
            P_Description=scan.nextLine();
            System.out.println("Enter the quantity:");
            P_Quantity=scan.next();
            System.out.println("Enter the price:");
            P_price=scan.nextInt();
            System.out.println("Details of the product");
            System.out.println("-----------------------");
            System.out.println(" Product name:"+ P_Name);
            System.out.println(" About the product:"+ P_Description);
            System.out.println(" Available stock:"+ P_Quantity);
            System.out.println(" Price:"+P_price);

        }
      

 
}
