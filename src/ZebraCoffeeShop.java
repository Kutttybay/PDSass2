import java.util.Scanner;

public class ZebraCoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Zebra Coffee!");
        System.out.println("Menu:");
        System.out.println("1. Basic Coffee - $2.00");
        System.out.println("2. Coffee with Milk - $2.50");
        System.out.println("3. Coffee with Sugar - $2.20");
        System.out.println("4. Coffee with Milk and Sugar - $2.70");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Coffee coffee = new BasicCoffee();

        if (choice == 2) {
            coffee = new MilkDecorator(coffee);
        } else if (choice == 3) {
            coffee = new SugarDecorator(coffee);
        } else if (choice == 4) {
            coffee = new MilkDecorator(new SugarDecorator(coffee));
        }

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.cost());

        scanner.close();
    }
}