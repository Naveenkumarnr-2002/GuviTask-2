package oops;

import java.util.Scanner;

// Product class creation
public class Product {

    public int pid;
    public int price;
    public int quantity;

    public Product(int pid,int price,int quantity){
        this.pid =pid;
        this.price =price;
        this.quantity =quantity;
    }

}
//ProductMain class creation
class ProductMain {

//    Method for find highest price holding product
public static int findHighPriceProduct(Product[] products){
    Product highPriceProduct=products[0];
    for (Product product:products){
        if (product.price>highPriceProduct.price){
            highPriceProduct=product;
        }
    }
   return highPriceProduct.pid;
}

// Method to calculate total amount spend on all products
public static int totalAmount(Product[] products){
   int totalAmount=0;

   for (Product product:products){
       totalAmount=totalAmount+ product.price* product.quantity;
   }
    return totalAmount;
}

// Main method
    public static void main(String[]args){

//  Scanner method for get product info from the user
    Scanner se=new Scanner(System.in);

        Product[]products=new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product "+(i+1)+" Information!");

            System.out.println("Enter the Product ID: ");
            int pid=se.nextInt();

            System.out.println("Enter the Price: ");
           int price=se.nextInt();

            System.out.println("Enter Product Quantity: ");
           int quantity=se.nextInt();

//           Store the product info in the arrays
            products[i]=new Product(pid,price,quantity);
        }

//     finding the high price product pid
        int highestPricePID=findHighPriceProduct(products);
        System.out.println("Highest price Product's PID: "+highestPricePID);

        //     finding the total amount spend on the all products

        int totalSpentAmount=totalAmount(products);
        System.out.println("Total amount spend on all products: "+totalSpentAmount);

    }
}
