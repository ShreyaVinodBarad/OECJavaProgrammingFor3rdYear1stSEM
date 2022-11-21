//Accept two integer and perform Addition and Subtraction by using 
//class InputStreamReader
import java.io.*;
public class ThirdQuestion{
    public static void main(String args[]) throws IOException{
        int a,b;
        InputStreamReader ISR= new InputStreamReader(System.in);
        BufferedReader BR=new BufferedReader(ISR);
        System.out.println("Addition and Subtraction of two Integer!");
        System.out.println("Addition of two Integer!");
        System.out.println("Enter the first Integer: ");
        a=Integer.parseInt(BR.readLine());
        System.out.println("Enter the second Integer: ");
        b=Integer.parseInt(BR.readLine());
        System.out.println("Addition of two Integer is: "+ (a+b));
        System.out.println("Subtraction of two Integer!");
        System.out.println("Enter the first Integer: ");
        a=Integer.parseInt(BR.readLine());
        System.out.println("Enter the second Integer: ");
        b=Integer.parseInt(BR.readLine());
        System.out.println("Subtraction of two Integer is: "+ (a-b));
    }
} 