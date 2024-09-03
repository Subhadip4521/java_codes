// Construct string from subset of char array.
class SubStringCons {
public static void main(String args[]) {
byte ascii[] = {98, 66, 67, 68, 69, 70 };
String s1 = new String(ascii);
System.out.println(s1);
String s2 = new String(ascii, 0, 3);
System.out.println(s2);
}
}