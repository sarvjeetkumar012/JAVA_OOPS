import java.io.*;
public class FileInput
{
public static void main(String[] args)
{
try
{
FileInputStream f1=new FileInputStream("one1.txt");
//f1.skip(10);
System.out.println(f1.available());
int a;
while((a=f1.read())!=-1)
System.out.print((char)a);
}
catch(IOException e)
{
System.out.println(e);
}

}
}