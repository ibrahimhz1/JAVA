package basics101;

enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{ // Can create constructors and functions inside the enums like class but constructor should be private
    Macbook(2000), Legion, ThinkPad(2500);
    private int price;

    private Laptop(){
        this.price = 3000;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}

public class EnumsJava {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s.ordinal()); // ordinal function is used to get the index number of the enum

        Status[] sarr = Status.values();
        for(Status ss : sarr){
            System.out.println(ss + " " + ss.ordinal());
        }

        // checking same or not with if condition
        Status st = Status.Failed;
        if(st == Status.Running) System.out.println("All Good");
        else if(st == Status.Failed) System.out.println("Something Wait");
        else if(st == Status.Pending) System.out.println("Wait around");
        else System.out.println("Done");

        // switch statement
        st = Status.Pending;
        switch(st){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Wait for Minute");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Laptop[] lap = Laptop.values();
        for(Laptop la : lap){
            System.out.println(la + " : " + la.getPrice());
        }

    }
}
