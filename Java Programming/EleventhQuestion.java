import java.util.Scanner;
public class EleventhQuestion{
    public static void main(String args[]){
        Scanner newObj=new Scanner(System.in);
        int a ,originalNumber, remainder, result = 0;
        System.out.println("Enter the number: ");
        a=Integer.parseInt(newObj.nextLine());
        originalNumber = a;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
        
    }
}
