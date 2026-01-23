import java.util.Scanner;
import java.nio.file.Paths;

public class VerifyCredentials {
  Scanner scanner = new Scanner(System.in);
  //private String userName;
  //private String password;
  private String fileName;

  public VerifyCredentials(/*String userName, String password, */ String fileName) {
    //this.userName = userName;
    //this.password = password;
    this.fileName = fileName;
  }

  // only need filename? cause username and password will be inserted directly to method
  public Boolean login() {
    System.out.println("Enter your username:");
    String userInputUsername = scanner.nextLine();

    System.out.println("Enter your password:");
    String userInputPassword = scanner.nextLine();

    String userInput = (userInputUsername + "," + userInputPassword);  // I could make a method that returns 2 strings in csv form
    //System.out.println(userInput);

    try (Scanner fileScanner = new Scanner(Paths.get(this.fileName))) {
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
          //System.out.println(line);

        // Skip empty lines
        if (line.trim().isEmpty()) {
            continue;
        }

        // if userInput equals a valid login, return true
        if (userInput.equals(line)) {
            System.out.println("");
            System.out.println("Welcome back " + userInputUsername + "!");
            return true;
            
        }
        if (!userInput.equals(line)) {
            System.out.println("Not a valid username or password! Please try again");
            
        }
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    return false;
  } 
}

