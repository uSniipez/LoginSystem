import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        VerifyCredentials userLogin = new VerifyCredentials("data/accounts.csv");
        CreateAccount createAccount = new CreateAccount();
        boolean validUser = false;

        while (!validUser) {
            System.out.println("Do you have a login already?  y/n");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("n")) {
                CreateAccount account = new CreateAccount();
                account.createAccount();
                
            } else if (userInput.equals("y")) {
                if (userLogin.login()) { 
                    validUser = true;
                    break;
                }
            } else System.out.println("Error: invalid input");
        }    
    }
}
