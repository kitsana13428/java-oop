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
    
    }
}
