/*
Import methods of file class:
1. boolean exists();
Returns true if the physical file or directory available.
2. booleancreateNewFile(); 
This method 1st checks whether the physical file is already available or not if it is 
already available then this method simply returns false without creating any 
physical file.
If this file is not already available then it will create a new file and returns true
3. booleanmkdir();
This method 1st checks whether the directory is already available or not if it is 
already available then this method simply returns false without creating any 
directory.
If this directory is not already available then it will create a new directory and 
returns true
4. booleanisFile();
Returns true if the File object represents a physical file.
5. booleanisDirectory();
Returns true if the File object represents a directory.
6. String[] list();
It returns the names of all files and subdirectories present in the specified 
directory.
7. long length();
Returns the no of characters present in the file.
8. boolean delete();
To delete a file or directory.

Requirement: Write a program to display the names of all files and directories present 
in c:\\charan_classes. 
*/

import java.io.*;
class FileDemo4
{
public static void main(String[] args)throws IOException
{ int count=0;
File f=new File("c:\\charan_classes");
String[] s=f.list();
for(String s1=s) {
count++;
System.out.println(s1);
 }
System.out.println("total number : "+count);
}
}
/*
Write a program to display only file names 
Program:
import java.io.*;
class FileDemo4
{
public static void main(String[] args)throws IOException
{ int count=0;
File f=new File("c:\\charan_classes");
String[] s=f.list();
for(String s1=s) {
File f1=new file(f,s1);
if(f1.isFile()) {
count++;
System.out.println(s1);
 }
 }
System.out.println("total number : "+count);
}
}
*/
/*
Write a program to display only directory names 
Program:
import java.io.*;
class FileDemo4
{
public static void main(String[] args)throws IOException
{ int count=0;
File f=new File("c:\\charan_classes");
String[] s=f.list();
for(String s1=s) {
File f1=new file(f,s1);
if(f1.isDirectory()) {
count++;
System.out.println(s1);
 }
 }
System.out.println("total number : "+count);
}
}
*/