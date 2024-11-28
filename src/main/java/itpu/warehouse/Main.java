package itpu.warehouse;

import itpu.warehouse.dao.ProductDAO;
import itpu.warehouse.dao.ProductDAOImpl;
import itpu.warehouse.entity.Product;
import itpu.warehouse.UI.Console;
import itpu.warehouse.utils.DataUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final ProductDAO productDAO = new ProductDAOImpl();
    private static final Console console = new Console();

    public static void main(String[] args) {
        System.out.println("Loading data...");
        DataUtil.loadDataFromCSV();
        console.printWelcomeMessage();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            switch (parts[0]) {
                case "search":
                    console.handleSearchCommand(parts, productDAO);
                    break;
                case "add":
                case "edit":
                    console.handleAddCommand(parts, productDAO);
                    break;
                case "listAll":
                case "listByType":
                    console.handleListCommand(parts, productDAO);
                    break;
                case "clear":
                    console.clearConsole();
                    break;
                case "help":
                    console.displayHelp();
                    break;
                case "exit":
                    exit = true;
                    console.printExitMessage();
                    break;
                default:
                    console.printInvalidCommandMessage();
            }
        }
        scanner.close();
    }
}
