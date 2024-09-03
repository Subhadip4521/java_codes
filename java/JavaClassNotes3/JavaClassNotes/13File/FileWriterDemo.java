/*
FileWriter:
By using FileWriter object we can write character data to the file. 
Constructors:
FileWriterfw=new FileWriter(String name);
FileWriterfw=new FileWriter(File f);
The above 2 constructors meant for overriding.
Instead of overriding if we want append operation then we should go for the following 2 
constructors.
FileWriterfw=new FileWriter(String name,boolean append);
FileWriterfw=new FileWriter(File f,boolean append);
If the specified physical file is not already available then these constructors will create 
that file.
Methods:
1. write(intch);
To write a single character to the file.
2. write(char[] ch);
To write an array of characters to the file.
3. write(String s);
To write a String to the file.
4. flush();
To give the guarantee the total data include last character also written to the file.
5. close();
To close the stream
*/

import java.io.*;
class FileWriterDemo
{
public static void main(String[] args)throws IOException
{
FileWriterfw=new FileWriter("cricket.txt",true);
fw.write(99);//adding a single character
fw.write("haran\nsoftware solutions");
fw.write("\n");
char[] ch={'a','b','c'};
fw.write(ch);
fw.write("\n");
fw.flush();
fw.close();
}
}
/*
Note :
 The main problem with FileWriter is we have to insert line separator manually , 
which is difficult to the programmer. ('\n')
 And even line separator varing from system to system.
*/