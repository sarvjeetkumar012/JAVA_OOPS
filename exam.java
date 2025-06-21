import java.io.*;

public class exam {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello from Writer class!\nWelcome to Java file handling.");
            fw.close();
            System.out.println("Data written successfully.");

            // Reading from file
            FileReader fr = new FileReader("data.txt");
            int ch;
            System.out.println("Reading from file:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
