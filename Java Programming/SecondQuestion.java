//Accept Employee Name, Gender and Profession and Display 
//the Message with class DataInputStream
import java.io.*;
public class SecondQuestion{
    public static void main(String args[]) throws IOException{
        String employeeName, employeeGender,employeeProfession;
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter the Name: ");
        employeeName =dis.readLine();
        System.out.println("Employee Name is:"+employeeName);
        System.out.println("Enter the Gender: ");
        employeeGender =dis.readLine();
        System.out.println("Employee Gender is:"+employeeGender);
        System.out.println("Enter the Profession: ");
        employeeProfession =dis.readLine();
        System.out.println("Employee Profession is:"+employeeProfession);
    }
} 