class A{
    void display(){
        System.out.println("Display Class");
    }
}
class B extends A{
    void show_B(){
        System.out.println("B is SubClass of A");
    }
}
class C extends A{
    void show_C(){
        System.out.println("C is Subclass of A");
    }
}
public class FourthteenQuestion{
    public static void main(String args[]){
        B obj1=new B();
        C obj2=new C();
        obj1.display();
        obj1.show_B();
        obj2.display();
        obj2.show_C();
        

    }
}

