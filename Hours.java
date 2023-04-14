import java.util.Scanner;
public class Hours{
public static void main (String[] args){
int  hrs, sec;
System.out.println("enter the values");
Scanner sc = new Scanner(System.in);
System.out.println("enter the hrs");
hrs= sc.nextInt();
sec=hrs*60*60;
System.out.println("the seconds taken for" +hrs+ "hours is" +sec);
}
}