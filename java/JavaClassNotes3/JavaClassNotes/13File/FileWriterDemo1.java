//Write a program to perform File merge(combine) operation.
import java.io.*; 
class FileWriterDemo1 
{ 
public static void main(String[] args)throws IOException {
PrintWriter pw=new PrintWriter("file3.txt"); 
BufferedReaderbr=new BufferedReader(new 
FileReader("file1.txt")); 
 String line=br.readLine(); 
while(line!=null) 
 { 
pw.println(line); 
line=br.readLine(); 
 } 
br=new BufferedReader(new FileReader("file2.txt")); //reuse 
line=br.readLine(); 
while(line!=null) 
 { 
pw.println(line); 
line=br.readLine(); 
} 
pw.flush(); 
br.close(); 
pw.close(); 
} 
}

/*Write a program to perform file merge operation where merging should 
be performed line by line alternatively.
import java.io.*; 
class FileWriterDemo1 { 
public static void main(String[] args)throws IOException {
PrintWriter pw=new PrintWriter("file3.txt"); 
BufferedReader br1=new BufferedReader(new 
FileReader("file1.txt")); 
BufferedReader br2=new BufferedReader(new 
FileReader("file2.txt")); 
 String line1=br1.readLine(); 
 String line2=br2.readLine(); 
while(line1!=null||line2!=null) 
 { 
if(line1!=null) 
{ 
pw.println(line1); 
line1=br1.readLine(); 
} 
if(line2!=null) 
{ 
pw.println(line2); 
 line2=br2.readLine(); 
} 
 } 
pw.flush(); 
br1.close(); 
br2.close(); 
pw.close(); 
 } 
} 
*/