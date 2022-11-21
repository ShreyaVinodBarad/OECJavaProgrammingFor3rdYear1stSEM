//Multiplication Table using DataInputStream.
import java.io.*;
public class FourthQuestion{
    public static void main(String args[]) throws IOException{
        int number; 
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Multiplication Table");
        System.out.println("Multiplication Table of : ");
        number=Integer.parseInt(dis.readLine());
        for(int i=1;i<11;i++){
            System.out.println(i+"*"+number+"="+(i*number));
        }
    } 
}