import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try{
        FileReader f = new FileReader("demo.txt");
        int data = f.read();
        System.out.println((char)data);
        f.close();
        }catch(IOException e){
            System.out.println("This is CheckedException Example file");
        }
    }
}
