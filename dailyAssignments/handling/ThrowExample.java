package handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) throws Exception {
        try {

            String f = "numbers.txt";
            File file = new File(f);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number > 0) {
                	
                    throw new Exception("Positive number found: " + number);
                }
            }

            scanner.close();
            System.out.println("No positive numbers found in the file.");

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());
    }
    }
}
