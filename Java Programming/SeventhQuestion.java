import java.io.*;
public class SeventhQuestion{
    public static void main(String args[]) throws IOException{
        int FactorialNum,Fact=1;
        DataInputStream myObj=new DataInputStream(System.in);
        System.out.println("Enter the FactorialNum: ");
        FactorialNum=Integer.parseInt(myObj.readLine());
        for(int i=1;i<=FactorialNum;i++){
            Fact=Fact*i;
        }
        System.out.println("The Factorial is: "+Fact);
     
    }
}