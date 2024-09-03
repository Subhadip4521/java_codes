/*
BufferedWriter:
By using BufferedWriter object we can write character data to the file. 
Constructors:
BufferedWriterbw=new BufferedWriter(writer w);
BufferedWriterbw=new BufferedWriter(writer w,intbuffersize); 
Note:BufferedWriter never communicates directly with the file it should communicates 
via some writer object.
Which of the following declarations are valid? 
1. BufferedWriterbw=new BufferedWriter("cricket.txt"); (invalid)
2. BufferedWriterbw=new BufferedWriter (new File("cricket.txt")); (invalid)
3. BufferedWriterbw=new BufferedWriter (new FileWriter("cricket.txt")); (valid) 

Methods: 
1. write(intch);
2. write(char[] ch);
3. write(String s);
4. flush();
5. close();
6. newline(); 
Inserting a new line character to the file.
When compared with FileWriter which of the following capability(facility) is available 
as method in BufferedWriter. 
1. Writing data to the file.
2. Closing the writer.
3. Flush the writer.
4. Inserting newline character. 
Ans : 4 
*/

import java.io.*;
class BufferedWriterDemo
{
public static void main(String[] args)throws IOException
{
FileWriterfw=new FileWriter("cricket.txt");
BufferedWriterbw=new BufferedWriter(fw);
bw.write(100);
bw.newLine();
char[] ch={'a','b','c','d'};
bw.write(ch);
bw.newLine();
bw.write("SaiCharan");
bw.newLine();
bw.write("software solutions");
bw.flush();
bw.close();
}
}
