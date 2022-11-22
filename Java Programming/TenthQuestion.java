//Palindrome number is a number t
//hat remains the same when its digits are reversed
import java.util.Scanner;
public class TenthQuestion{
    public static void main(String args[]){
    Scanner newObj=new Scanner(System.in);
        int a, reve=0,n;
        System.out.println("Enter the number: ");
        a=Integer.parseInt(newObj.nextLine());
        while(a!=0){
            n=a%10;
            reve=(reve*10)+n;
            a=a/10;
        }
        System.out.println(reve);
        if(reve==a){
            System.out.println("It is a Palindrome number");
        }
        else{
            System.out.println("It is not Palindrome number");
        }
    }
}
