package multicatch;

import java.io.IOException;

public class MultiCatchExample3 {
    public static void main(String[] args) {
        try {
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {

                System.out.println("NullPointerException caught: " + e.getMessage());

                throw new IOException("IOException occurred inside catch block");
            }
        } catch (NullPointerException | IOException e) {

            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
