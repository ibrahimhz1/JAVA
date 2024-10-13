package classAndObj;

class Sample{
    // Static block execute when class is loaded
    static{
        System.out.println("Inside static");
    }
    public Sample(){
        System.out.println("Inside const");
    }

}

class Mobile{
    static String company;
    int price;

    public void details(){
        System.out.println("Company : " + company + " price : " + price);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile.company = "Samsung";
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.price = 20000;
        m1.details();
        m2.price = 30000;
        m2.details();
        try{
            Sample sam1 = new Sample();
            Class.forName("Sample");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}