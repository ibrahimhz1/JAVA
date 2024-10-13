package classAndObj;

class SampleClass{
    public SampleClass(){
        System.out.println("constructor of SamplesClass");
    }

    public void printDetail(){
        System.out.println("hello world");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new SampleClass(); // Anonymous Object the object is created in heap memory but has no reference variable in stack so it cannot be reused again.
        new SampleClass().printDetail();
    }
}