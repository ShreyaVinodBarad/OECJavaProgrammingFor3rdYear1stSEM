import java.util.Scanner;
public class NinthQuestion{
    public static void main(String args[]){
        Scanner newObj=new Scanner(System.in);
        int a;
        System.out.println("Enter the number: ");
        a=Integer.parseInt(newObj.nextLine());
        if(a%2==0){
            System.out.println("a is the Even number ");
        }
        else{
            System.out.println("a is the Odd number ");
        }
    }
}