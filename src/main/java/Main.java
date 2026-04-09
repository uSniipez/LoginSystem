import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        VerifyCredentials userLogin = new VerifyCredentials("accounts.csv");
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





/*
todo:
- Ask user if they have an acount 
    - if no prompt to create account
        - get username + password and write it to accounts.csv
    
    - if yes proceed to login screen

    while (validUser == false) {
        if (userLogin.login()) {

            System.out.println("");
            System.out.println("Welcome back user!");  // figure out how to username. maybe userLogin.getUsername
            validUser = true;
            break;
        }
    }

*/

/*
boolean validUser = verifyCredentials();  // need to make verifycreds return a boolean

if (validUser) { 
    System.out.println("Login successful"); 
    } else { 
    System.out.println("Login failed"); }
    
*/