/*
Note: in UNIX everything is a file, java "file IO" is based on UNIX operating system 
hence in java also we can represent both files and directories by File object only.
File class constructors:
1. File f=new File(String name); 
Creates a java File object that represents name of the file or directory in current 
working directory.
2. File f=new File(String subdirname,String name);
Creates a File object that represents name of the file or directory present in 
specified sub directory.
3. File f=new File(File subdir,String name);


Requirement: Write code to create a file named with demo.txt in current working 
directory
*/

import java.io.*;
class FileDemo2
{
public static void main(String[] args)throws IOException
{
File f=new File("demo.txt");
f.createNewFile();
}
}








