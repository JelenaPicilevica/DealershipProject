import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership!");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");

        String option = scanner.nextLine();

        switch (option){
            case "a":
                System.out.println("What is your budget?");
                int budget = scanner.nextInt();

                if (budget >= 10000){

                    System.out.println("\nGreat! A Nissan Altima is available for you.");
                    System.out.println("Do you have insurance? Write 'yes' or 'no'.");
                    scanner.nextLine();
                    String insurance = scanner.nextLine();

                    System.out.println("\nDo you have a driver's license? Write 'yes' or 'no'.");
                    String licence = scanner.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scanner.nextInt();

                    if (insurance.equals("yes") && licence.equals("yes") && creditScore > 660){
                        System.out.println("\nSold! Pleasure doing business with you.");
                    }else{
                        System.out.println("\nWe're sorry, you are not eligible.");
                    }

                }else{
                    System.out.println("We don't sell cars under $10,000. Sorry!");
                }
                break;


            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scanner.nextInt();

                System.out.println("\nWhat is your selling price?");
                int price = scanner.nextInt();

                if(value>price && price<30000){
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                }else
                {
                    System.out.println("\nSorry, we're not interested!");
                }
                break;

            default:
                System.out.println("Invalid option.");
        }




    }
}
