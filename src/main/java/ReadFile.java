import java.util.Scanner;
import java.nio.file.Paths;

public class ReadFile {
  Scanner scanner = new Scanner(System.in);
  String fileName;
  
  public ReadFile(String fileName) {
    this.fileName = fileName;
  }
  
  public void readCsvFile() {
      try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            //skips header
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            // Skip empty lines
            if (line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split(",");
            String userName = parts[0];
            String password = parts[1];
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
  }
}

    
  


  