import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class CreateAccount {
  Scanner scanner = new Scanner(System.in);
  private String userName;
  private String password;

  public void createAccount() {
    try (FileWriter createAccount = new FileWriter("data/accounts.csv", true)) {
      System.out.println("Enter a username below: ");
      this.userName = scanner.nextLine();

      System.out.println("Enter a password below: ");
      this.password = scanner.nextLine();

      createAccount.write(userName + "," + password + "\n");
      System.out.println("Successfully created a new account!");

    } catch (IOException e) {

      System.out.println("Error: this shit don't work");
      e.printStackTrace();
    }
  }
}