/*
PrintWriter:
 This is the most enhanced Writer to write text data to the file.
 By using FileWriter and BufferedWriter we can write only character data to the 
File but by using PrintWriter we can write any type of data to the File.
Constructors:
PrintWriter pw=new PrintWriter(String name);
PrintWriter pw=new PrintWriter(File f);
PrintWriter pw=new PrintWriter(Writer w); 
PrintWriter can communicate either directly to the File or via some Writer object also.
Methods:
1. write(intch);
2. write (char[] ch);
3. write(String s);
4. flush();
5. close();
6. print(char ch);
7. print (int i);
8. print (double d);
9. print (boolean b);
10. print (String s);
11. println(char ch);
12. println (int i);
13. println(double d);
14. println(boolean b);
15. println(String s);
Example: 
*/
import java.io.*; 
class PrintWriterDemo { 
public static void main(String[] args)throws IOException
{ 
FileWriterfw=new FileWriter("cricket.txt"); 
PrintWriter out=new PrintWriter(fw); 
out.write(100); 
out.println(100); 
out.println(true); 
out.println('c'); 
out.println("SaiCharan"); 
out.flush(); 
out.close(); 
} 
} 
*/
Output: 
d100 
true
c
SaiCharan
What is the difference between write(100) and print(100)?
In the case of write(100) the corresponding character "d" will be added to the File but 
in the case of print(100) "100" value will be added directly to the File. 
Note 1: 
1. The most enhanced Reader to read character data from the File is 
BufferedReader.
2. The most enhanced Writer to write character data to the File is PrintWriter.
Note 2: 
1. In general we can use Readers and Writers to handle character data. Where as 
we can use InputStreams and OutputStreams to handle binary data(like images, 
audio files, video files etc).
2. We can use OutputStream to write binary data to the File and we can use 
InputStream to read binary data from the File
*/