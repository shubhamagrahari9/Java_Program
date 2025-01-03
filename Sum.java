import java.util.*;

public class Sum{
    public static void main(String args[]){
        System.out.println("Enter your first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter your Second number");
        
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("Sum of "+x +" and "+ y +" = " + sum);
    }
}