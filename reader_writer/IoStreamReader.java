import java.io.*;

public class IoStreamReader{
public static void main(String args[]) throws IOException{
File i = new File ("Z:/java/input.txt");
File o = new File ("output.txt");

FileReader fr = new FileReader(i);
FileWriter fw = new FileWriter(o);
int a;
while ((a = fr.read()) != -1){
System.out.print((char)a);
fw.write(a);
}
fr.close();
fw.close();
}
}

