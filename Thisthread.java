class Threadt1 implements Runnable{
public void run(){
System.out.println("thread is about to begin");
for(int i=1;i<5;i++){
System.out.println("i =" +i);
}
}
}

public class Thisthread {
public static void main(String args[]){
Threadt1 t1 = new Threadt1();
Thread t = new Thread(t1);
t.start();
}
}