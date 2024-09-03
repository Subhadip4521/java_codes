/*
1. File
2. FileWriter
3. FileReader
4. BufferedWriter
5. BufferedReader
6. PrintWriter
File:
File f=new File("abc.txt"); 
This line 1st checks whether abc.txt file is already available (or) not if it is already 
available then "f" simply refers that file.
If it is not already available then it won't create any physical file just creates a java File 
object represents name of the file.
*/
import java.io.*;
class FileDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("cricket.txt");
System.out.println(f.exists());//false
f.createNewFile();
System.out.println(f.exists());//true
}
}
