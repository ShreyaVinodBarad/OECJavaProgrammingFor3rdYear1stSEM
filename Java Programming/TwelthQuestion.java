class A{
    void display(){
        System.out.println("Display Class");
    }
}
class B extends A{
    void show(){
        System.out.println("Show method class");
    }
}
public class TwelthQuestion{
    public static void main(String args[]){
        B obj=new B();
        obj.display();
        obj.show();


    }
}