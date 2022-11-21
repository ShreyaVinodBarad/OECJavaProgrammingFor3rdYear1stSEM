//Accept radius and find area and circumference of Circle.
import java.util.Scanner;
public class FifthQuestion{
    public static void main(String args[]){
        int radius;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        radius=Integer.parseInt(myObj.nextLine());
        System.out.println("The area of Circle is: "+Math.PI*radius*radius);
        System.out.println("The circumference of Circle is: "+2*Math.PI*radius);
    }
}