package multicatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchExample2 {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("Abstraction.txt");
            fr.read();
        } catch (FileNotFoundException e) {

            System.out.println("File not found " );
        } catch (IOException e) {

            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

