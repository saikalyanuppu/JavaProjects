package handling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFinally3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {

            FileReader fr = new FileReader("file.txt");
            fr.read(); 

        } catch (IOException e) {
        	
            System.out.println("IOException caught: " + e.getMessage());
            
        } finally {

            if (scanner != null) {
                scanner.close();
            }
            System.out.println("final block executed");
        }

        System.out.println("Rest of the scenario");
    }
}

