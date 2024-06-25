package exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNFoundExample {
    public static void main(String[] args) {
        try {
 
            File file = new File("file.txt");
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
        	
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

