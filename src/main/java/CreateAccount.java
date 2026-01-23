import java.util.Scanner;

public class CreateAccount {
  Scanner scanner = new Scanner(System.in);
  private String userName;
  private String password;

  public CreateAccount() {
    //this.userName = username;
   // this.password = password;
    
  }

  // Asks user to set username and password
  public void getUsername() {
    System.out.println("Enter a username below: ");
    this.userName = scanner.nextLine(); 
  }

  public void getPassword() {
    System.out.println("Enter a password below: ");
    this.password = scanner.nextLine();
  }
  
  
  public void setUsername (String i) {
    this.userName = i;
  }

  public void setPassword(String i) {
    this.password = i;
  }
  
  public void accountInformation() {
    System.out.println(this.userName + " " + this.password);
  }

  public void createAccount() {
    getUsername();
    getPassword();
    String userInput = this.userName + "," + this.password;
    System.out.println(userInput + "needs to be added to a database still");
  }
}
