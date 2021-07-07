public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(); //Create Object
        e1.setID("1");
        e1.setName("Kitsana");
        e1.setSalary(30000.0);

        Employee e2 = new Employee(); //Create Object
        e2.setID("2");
        e2.setName("Anastik");
        e2.setSalary(25000.0);

        e1.displayEmployee();
        System.out.println(""+e2.getName()); //ดึงมาแค่ชื่อ
        System.out.println(""+e2.getSalary());

        int result = Employee.minSalary; //ดึง salary มาใช้งาน
        System.out.println(result); //แสดงผล  
        
        System.out.println("---------------");

        Programmer p1 = new Programmer();
        p1.setName("kitsana");
        p1.setSalary(40000.0);
        p1.displayEmployee();
        System.out.println("---------------");

        Accounting ac1 = new Accounting();
        ac1.setName("Somchai");
        ac1.setSalary(30000.0);
        ac1.displayEmployee();
        System.out.println("---------------");


    
    }
}
