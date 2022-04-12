import java.util.Scanner;

public class food
{
    public static void main(String[] args) {
        String mainItem = "Taco";
        double mainQuantity = 0;
        double mainPrice = 0;
        double totalPrice =0;

        //**** USER PROMPT **** //

        Scanner scanner = new Scanner(System.in);

          // ** Main Item
        System.out.println("What would you like to order?");
               // * Main Item Scanner

        mainItem = scanner.nextLine();
        System.out.println("Your Item: " + mainItem);


          // ** Main Quantity Scanner
        System.out.println("How many would you like to have ? ");
               // * Main Quantity Scanner
        mainQuantity = scanner.nextInt();
        System.out.println("Your Quantity: " + mainQuantity);


        // ** Main Price
        System.out.println("Enter the Price for your food item: ");
               // * Main Price scanner
        mainPrice = scanner.nextDouble();
        System.out.println("Your Price: " + mainPrice);


        // ** Total Price
        System.out.println("Your Total Price will be: ");
        System.out.println(mainPrice * mainQuantity);

    }



}
