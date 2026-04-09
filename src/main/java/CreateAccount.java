import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class CreateAccount {
  Scanner scanner = new Scanner(System.in);
  private String userName;
  private String password;

  public void createAccount() {
    try (FileWriter writeCreateAccount = new FileWriter("D:\\Data\\Repositories\\LoginSystem\\data\\test.csv")) {
      writeCreateAccount.write("is this working yet");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error: this shit don't work");
      e.printStackTrace();
    }
  }
}


  /* // Asks user to set username and password
  public void createUsername() {
    System.out.println("Enter a username below: ");
    this.userName = scanner.nextLine(); 
  }

  public void createPassword() {
    System.out.println("Enter a password below: ");
    this.password = scanner.nextLine();
  }
  */

  
  /*
  // #TODO why are these here
  public void setUsername (String i) {
    this.userName = i;
  }

  public void setPassword(String i) {
    this.password = i;
  }
   */
  /*
  public void accountInformation(); {
    System.out.println(this.userName + " " + this.password);
  }

  public void createAccount() {
    createUsername();
    createPassword();
    String userInput = this.userName + "," + this.password;
    System.out.println(userInput + "needs to be added to a database still");
  };
}
*/