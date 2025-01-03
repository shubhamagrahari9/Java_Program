import java.util.*;
public class Area{
    public static void main(String args[]){
        System.out.println("Enter the radius of Circle :");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
/*  "We have to write f after the decimal value because java consider every decimal value 
as a double, if we don't specify the type of it." */

        System.out.println("The area of the circle is :");
        System.out.println(area);
    }
}