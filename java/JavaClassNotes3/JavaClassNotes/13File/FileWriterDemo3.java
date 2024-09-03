/*
write a program to perform file extraction operation. 
*/
import java.io.*; 
class FileWriterDemo3
{ 
public static void main(String[] args)throws IOException
 { 
BufferedReader br1=new BufferedReader(new 
FileReader("input.txt")); 
PrintWriter pw=new PrintWriter("output.txt"); 
String line=br1.readLine(); 
while(line!=null) 
{ 
boolean available=false; 
BufferedReader br2=new BufferedReader(new 
FileReader("delete.txt")); 
 String target=br2.readLine(); 
while(target!=null) 
{ 
if(line.equals(target)) 
 { 
available=true; 
break; 
 } 
target=br2.readLine(); 
} 
if(available==false) 
{ 
pw.println(line); 
} 
line=br1.readLine(); 
 } 
pw.flush(); 
 } 
}