class Addition{
    public void add(int a, int b){
    System.out.println(a+b);
  }
} 
class Subtraction extends Addition{
    public void sub(int a, int b){
    System.out.println(a-b);
    }

    public void CallAllMethods(){
    add(3,2);
    sub(4,3);
    }
}
public class ThirteenQuestion{
    public static void main(String args[]){
        Subtraction s =new Subtraction();
        s.CallAllMethods();

    }
}