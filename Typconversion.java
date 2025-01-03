import java.util.*;
public class Typconversion {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Now we will convert it into float data type:-");
        float y = x;
        System.out.println(y);
    }
    // This is called implicit or widening type conversion.
}
/*1. Type Conversion occurs when we convert a data type into another data type.
  2. For Conversion, data type should be compatible with another data type e.g. we can
  convert "int" into "float".
  3. For conversion "Destination Data type > Source Data type".
  Note:- We can also convert "float" into "int" but it will be "lossy conversion" because
  some data may be lost.
  Order of Conversion is as following:-
  byte=>short=>int=>float=>long=>double
  "byte" should be convert into "short" and "short" should be convert into "int"......
 */