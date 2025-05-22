import java.io.*;
public class FileO
{
public static void main(String[] args)
{
try
{
FileOutputStream f1=new FileOutputStream("one1.txt",true);
String val="This is my first file handling program";
byte b[]=val.getBytes();
f1.write(b);
f1.close();
}
catch(IOException e)
{
System.out.println(e);
}
System.out.println("data written in one.txt file");
}
}