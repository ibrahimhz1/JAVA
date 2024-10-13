package classAndObj.UpCastDownCast;

class A{
    public void show1(){
        System.out.println("Inside the A ");
    }
}

class B extends A{
    public void show2(){
        System.out.println("Inside the B ");
    }
}

public class UpCastingDownCasting {
    public static void main(String[] args) {
        // UpCast
        A obj1 = new B();
        obj1.show1();
        // DownCast
        B obj2 = (B) obj1;
        obj2.show2();
    }
}
