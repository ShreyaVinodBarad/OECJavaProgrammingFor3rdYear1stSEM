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
class D extends C{
    void show_D(){
        System.out.println("D is Subclass of C");
    }
}

public class FifthteenQuestion{
    public static void main(String args[]){
        D obj1=new D();
        obj1.display();obj1.show_C();obj1.show_D();  
    }
}

