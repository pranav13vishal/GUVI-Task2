package Task2.program2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creating a array to store 5 product details
        Product[] p1 = new Product[5];

        //Getting input of the products
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter Product ID for product " + (i+1) + " :");
            int pid = sc.nextInt();

            System.out.println("Enter Price for product " + (i+1) + " :");
            int price = sc.nextInt();

            System.out.println("Enter quantity of product " + (i+1) + " :");
            int quantity = sc.nextInt();

            // storing details in the array
            p1[i] = new Product(pid, price, quantity);
        }

        // Gets the pid of the product with the highest price
        int highestPricePid = findHighestPrice(p1);
        System.out.println("The Product ID with the highest price is: " + highestPricePid);

        // Gets the calculated total amount spent on all products
        double totalAmount = calculate(p1);
        System.out.println("The total amount spent on all products is: " + totalAmount);
        }

        // Method to find the pid of the product with the highest price
        public static int findHighestPrice(Product[] p1) {
        double maxPrice = p1[0].getPrice();
        int maxPid = p1[0].getPid();
            for (int i = 1; i < 5; i++) {
                if(p1[i].getPrice()>maxPrice){
                    maxPid = p1[i].getPid();
                    maxPrice = p1[i].getPrice();
                }
            }
            return maxPid;
    }

    // method to calculated total amount spent on all products
    public static double calculate(Product[] p1) {
        double total_amount = 0;
        for (Product product : p1) {
            total_amount += product.getPrice() * product.getQuantity();
        }
        return total_amount;
        }

    }


