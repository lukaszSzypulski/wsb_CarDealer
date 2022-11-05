package dealer;

import java.util.Scanner;

public class Main {

    DataBaseConnection dbc = new DataBaseConnection();

    private static void sleepThreader() {
        try {
            Thread.sleep(3000);
       //TODO: change catch statement
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args){

        Main main = new Main();
        main.menu(main);
    }

    private void menu(Main main) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println(
                    """
                            Menu:
                            1. List the cars you can buy
                            2. Buy a car
                            3. List owned cars
                            4. Repair the car
                            5. View the potential clients
                            6. Sell a car to potential client
                            7. Buy an advertising
                            8. Check your accounts history
                            9. Check transactions history
                            10. Check car repair history
                            11. Check how much you spent to fix and clean a car
                            0. Exit program
                            
                            Choose one of option:"""
            );
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Input Integer, try again\n");
                sleepThreader();
                continue;
            }
            if (0 <= choice && choice <13){
                main.chosenOption(choice);
                }
            else {
                System.out.println("Choose number from range 1-12");
                sleepThreader();
            }

        }
        while (choice >= 0);
    }

    private void chosenOption(Integer i){

        switch (i){
            case 0 -> System.exit(0);
            case 1 -> dbc.readFromDatabase("Rental", "SELECT * FROM carsforrent");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            case 6 -> System.out.println("6");
            case 7 -> System.out.println("7");
            case 8 -> System.out.println("8");
            case 9 -> System.out.println("9");
            case 10 -> System.out.println("10");
            case 11 -> System.out.println("11");
        }
    }
}
