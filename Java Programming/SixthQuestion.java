import java.io.*;
public class SixthQuestion{
    public static void main(String args[]) throws IOException{
        int a,b;
        DataInputStream myObj=new DataInputStream(System.in);
        System.out.println("Enter the first Integer: ");
        a=Integer.parseInt(myObj.readLine());
        System.out.println("Enter the seecond Integer: ");
        b=Integer.parseInt(myObj.readLine());
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Divison: "+(a/b));
    }
}