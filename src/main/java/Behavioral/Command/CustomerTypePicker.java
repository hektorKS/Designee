package main.java.Behavioral.Command;

public class CustomerTypePicker {

    public static BillPayer getStudent(){
        return new Student();
    }

    public static BillPayer getManOver60(){
        return new ManOver60();
    }

    public static BillPayer getManUnder60(){
        return new ManUnder60();
    }

    public static BillPayer getWomanOver60(){
        return new WomanOver60();
    }
}
