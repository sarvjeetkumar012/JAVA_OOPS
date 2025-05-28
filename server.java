import java.net.*;
import java.io.*;
public class server {
    public static void main(String[] args) {
        try{
            ServerSocket s = new ServerSocket(1323);
            for(;;){
                Socket st = s.accept();
                InputStream is = st.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                System.out.println("Client request");
                System.out.println(br.readLine());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
