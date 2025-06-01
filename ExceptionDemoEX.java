import java.io.FileNotFoundException;

public class ExceptionDemoEX {
    public static void main(String[] args) {
        // Unchecked exception: ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught (Unchecked): " + e);
        }

        // Checked exception: FileNotFoundException
        try {
            throw new FileNotFoundException("File not found!"); // Checked
        } catch (FileNotFoundException e) {
            System.out.println("Caught (Checked): " + e);
        }
    }
}
