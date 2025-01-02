import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransactionTrackerByProfMap {
    public static void main(String[] args) {

        ArrayList<Map<String, Object>> transactions = new ArrayList<>(); // List to hold transactions as Maps
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nFinancial Transaction Tracker");
            System.out.println("1. Add Transaction");
            System.out.println("2. Transactions Yesterday");
            System.out.println("3. Total Income and Expense");
            System.out.println("4. Exit");
            System.out.println("5. Print all");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Transaction
                    System.out.print("Enter type (Purchase/Sale): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    LocalDate date = LocalDate.now();

                    // Create a transaction as a Map
                    Map<String, Object> transaction = new HashMap<>();
                    transaction.put("type", type);
                    transaction.put("amount", amount);
                    transaction.put("date", date);

                    transactions.add(transaction);
                    System.out.println("Transaction added.");
                    break;

                case 2: // Transactions Yesterday
                    LocalDate yesterday = LocalDate.now().minusDays(1);
                    int count = 0;

                    for (Map<String, Object> transactionMap : transactions) {
                        LocalDate transactionDate = (LocalDate) transactionMap.get("date");
                        if (transactionDate.equals(yesterday)) {
                            count++;
                        }
                    }

                    System.out.println("Transactions yesterday: " + count);
                    break;

                case 3: // Total Income and Expense
                    double income = 0, expense = 0;

                    for (Map<String, Object> transactionMap : transactions) {
                        String tType = (String) transactionMap.get("type");
                        double tAmount = (double) transactionMap.get("amount");

                        if (tType.equalsIgnoreCase("Sale")) {
                            income += tAmount;
                        } else if (tType.equalsIgnoreCase("Purchase")) {
                            expense += tAmount;
                        }
                    }

                    System.out.println("Total Income: " + income);
                    System.out.println("Total Expense: " + expense);
                    break;

                case 4: // Exit
                    System.out.println("Exiting tracker. Goodbye!");
                    scanner.close();
                    return;

                case 5: // Print all
                    System.out.println("All Transactions:");
                    for (Map<String, Object> transactionMap : transactions) {
                        System.out.println(transactionMap);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
