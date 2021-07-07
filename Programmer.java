public class Programmer extends Employee{
    
    public String skill = "JAVA PHP C PYTHON"; 
    //Method
    public Programmer(String name, Double salary){
        super(name, salary); //ดึงคาสแม่มาใช้
        System.out.println("I'm Programmer!");
    }
}
