public class Accounting extends Employee{
    
    //Method
    public Accounting(String name, Double salary){
        super(name, salary); //ดึงคาสแม่มาใช้
        System.out.println("I'm Accounting!");
    }
}
