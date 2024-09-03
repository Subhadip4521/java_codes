/*
Write a program to merge data from all files present in a folder into a 
new file 
*/
import java.io.*; 
class TotalFileMerge { 
public static void main(String[] args)throws IOException {
PrintWriter pw=new PrintWriter("output.txt"); 
File f=new File("E:\\xyz");
String[] s=f.list();
for(String s1=s) {
BufferedReader br1=new BufferedReader(new File(f,s1)); 
String line=br.readLine(); 
while(line!=null) 
{ 
pw.println(line); 
line=br.readLine(); 
} 
}
pw.flush(); 
 } 
}