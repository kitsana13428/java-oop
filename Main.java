public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(); //Create Object
        e1.setID("1");
        e1.setName("Kitsana");
        e1.setSalary(30000.0);

        e1.displayEmployee();
        System.out.println(""+e1.getName()); //ดึงมาแค่ชื่อ

        int result = Employee.minSalary; //ดึง salary มาใช้งาน
        System.out.println(result); //แสดงผล  
        
        System.out.println("---------------");

        Programmer p1 = new Programmer("kitsana",40000.0); 

        Accounting ac1 = new Accounting("Anastik", 30000.0);
    


    
    }
}
