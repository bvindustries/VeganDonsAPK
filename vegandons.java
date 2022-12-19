import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class VeganDonsAPK {
  public static void main(String[] args) {
    // Set default language to English
    Locale currentLocale = Locale.ENGLISH;

    // Create a Scanner object for reading input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a language code
    System.out.print("Enter language code (en, fr, etc.): ");
    String languageCode = scanner.nextLine();

    // Set the language to the specified locale
    currentLocale = new Locale(languageCode);

    // Load the resource bundle for the specified locale
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);

    // Get the value of the "greeting" key from the resource bundle
    String greeting = messages.getString("greeting");

    // Print the greeting to the console
    System.out.println(greeting);
  }
}

