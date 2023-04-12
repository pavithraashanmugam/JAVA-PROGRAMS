import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = sc.nextInt();
        System.out.println("Enter the value of y:");
        y = sc.nextInt();
        if (x==y){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}