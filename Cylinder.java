import java.util.Scanner;
public class Cylinder{
    public static void main (String[] args){

        double area;
        float len;
        float rad;
        double vol;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the cylinder");
        rad =sc.nextFloat();
        System.out.println("enter the length of the cylinder");
        len =sc.nextFloat();
        area = (rad *rad * 3.14);
        System.out.println("the area of the cylinder is" +area);
        vol=  area* len;
        System.out.println("the area of the cylinder is" +vol);
    }
}