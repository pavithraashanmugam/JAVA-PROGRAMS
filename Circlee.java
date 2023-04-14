import java.util.*;
import java.lang.*;
public class Circlee{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
double radius;
String color;
System.out.println("\n enter the radius");
radius=sc.nextDouble();
System.out.println("\n enter the color");
color=sc.next();
cals def=new cals();
def.print();

cals def1=new cals(radius,color);
def1.print();




}
}
class cals{
double radius=1.0;
String color = "red";
double area;
double perimeter;
	
	cals(){
	area = Math.PI*radius*radius;
	perimeter = 2*Math.PI*radius;
}
cals(double r,String c){
radius=r;
color = c;
area = Math.PI*radius*radius;
perimeter = 2*Math.PI*radius;
}

void print(){
	System.out.println("area of the circle : "+area);
System.out.println("perimeter of the circle: "+perimeter+'\n');
}
}
