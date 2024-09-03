/*
FileReader:
By using FileReader object we can read character data from the file. 
Constructors:
FileReaderfr=new FileReader(String name); 
FileReaderfr=new FileReader (File f); 
Methods:
1. int read();
It attempts to read next character from the file and return its Unicode value. If 
the next character is not available then we will get -1. 
2. int i=fr.read();
3. System.out.println((char)i);
As this method returns unicodevalue , while printing we have to perform type 
casting. 
4. int read(char[] ch); 
It attempts to read enough characters from the file into char[] array and returns 
the no of characters copied from the file into char[] array. 
5. File f=new File("abc.txt");
6. Char[] ch=new Char[(int)f.length()];
7. void close();
*/

import java.io.*;
class FileReaderDemo
{
public static void main(String[] args)throws IOException
{
FileReaderfr=new FileReader("cricket.txt");
int i=fr.read(); //more amount of data
while(i!=-1)
{
System.out.print((char)i);
i=fr.read();
}
}
}
/*
Approach 2:
import java.io.*;
class FileReaderDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("cricket.txt");
FileReaderfr=new FileReader(f);
char[] ch=new char[(int)f.length()]; //small 
amount of data
fr.read(ch);
for(char ch1:ch)
{
System.out.print(ch1);
}
}
}
*/
/*
Usage of FileWriter and FileReader is not recommended because :
1. While writing data by FileWriter compulsory we should insert line separator(\n) 
manually which is a bigger headache to the programmer.
2. While reading data by FileReader we have to read character by character 
instead of line by line which is not convenient to the programmer.
3. To overcome these limitations we should go for BufferedWriter and 
BufferedReader concepts.
*/