//Accept user Name, Age, Gender and Roll No. and Display the message.
import java.util.Scanner;
public class FirstQuestion{
    public static void main(String args[]){
        String userName,userAge,userGender,UserRollNo;
        Scanner myObj= new Scanner(System.in);
        //User Name
        System.out.println("Enter the Name: ");
        userName =myObj.nextLine();
        System.out.println("Name is "+userName);
        //User Age
        System.out.println("Enter the Age: ");
        userAge=myObj.nextLine();
        System.out.println("Age is " +userAge);
        //User Gender
        System.out.println("Enter the Gender: ");
        userGender=myObj.nextLine();
        System.out.println("Gender is: " +userGender);
        //User Roll No.
        System.out.println("Enter the Roll No.: ");
        UserRollNo=myObj.nextLine();
        System.out.println("Roll No. is: " +UserRollNo);
    }
}