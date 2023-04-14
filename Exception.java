//write a simple java proram to throw 10 different unique exceptions
import java.io.*;
import java.util.*;
class Exception{
public static void main (String args[]){
Thread t = new Thread();
//t.setPriority(1000); //illegal argument
//t.start(); //illegal state exception
//t.start();
try{
int a=5;
int b=0;
int c = a/b;
System.out.println(c);
}
catch (ArithmeticException e){
System.out.println("1. ARITHMATIC EXCEPTION");
}
try{
String a =null;
System.out.println(a.charAt(0));
}
catch(NullPointerException e){
System.out.println("2. NULLPOINT EREXCEPTION");
}
try{
String s="Hello World";
char c = s.charAt(12);
System.out.println(c);
}
catch(StringIndexOutOfBoundsException e){
System.out.println("3. STRING INDEX OUT OF BOUND");
}
try{
int a[] = new int [12];
a[13]=1;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("4. ARRAY INDEX OUT OF BOUND");
}
try{
File file = new File("z://newfile.txt");
FileReader fr = new FileReader(file);
}
catch(FileNotFoundException e){
System.out.println("5. FILE IS NOT FOUND");
}
try{
int num = Integer.parseInt("abcd");
System.out.println(num);
}
catch(NumberFormatException e){
System.out.println("6. NUMBER FORMAT EXCEPTION");
}
Scanner scan = new Scanner("7. hello");
System.out.println("" + scan.nextLine());
System.out.println("EXCEPTION :"  +scan.ioException());
scan.close();
}
}
