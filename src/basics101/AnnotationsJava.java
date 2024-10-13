package basics101;

@Deprecated
class SampleA{
    public void show(){
        System.out.println("hello welcome");
    }
}
class SampleB extends SampleA{
    @Override
    public void show(){
        System.out.println("hello world");
    }
}
public class AnnotationsJava {
    public static void main(String[] args) {
        SampleB sam = new SampleB();
        sam.show();
    }
}
