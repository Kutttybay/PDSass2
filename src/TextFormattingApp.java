import java.util.Scanner;

public class TextFormattingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 5: Accept user input for the text
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Step 6: Create a BasicTextFormatter
        TextFormatter basicText = new BasicTextFormatter();

        // Step 7: Apply formatting options based on user input
        System.out.println("Choose formatting options:");
        System.out.println("1. Bold");
        System.out.println("2. Italic");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Apply Bold Text formatting
            TextFormatter formattedText = new BoldTextDecorator(basicText);
            System.out.println("Formatted Text: " + formattedText.format(inputText));
        } else if (choice == 2) {
            // Apply Italic Text formatting
            TextFormatter formattedText = new ItalicTextDecorator(basicText);
            System.out.println("Formatted Text: " + formattedText.format(inputText));
        } else {
            System.out.println("Invalid choice. No formatting applied.");
        }

        // Close the scanner
        scanner.close();
    }
}