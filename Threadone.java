public class Threadone extends Thread{
public void run(){
System.out.println("thread one is running");
}

public class Threadtwo extends Thread{
public void run(){
System.out.println("this is thread two");
}
}
public static void main(String args[]){
Threadone t1 = new Threadone();
Threadtwo t2 = new Threadtwo();
t1.start();
t2.start();
}
}