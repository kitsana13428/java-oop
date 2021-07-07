public class Employee {
    //Attribute
    private String id;
    private String name;
    private Double salary;

    static int minSalary = 12000; //Static Attribute สามารถดึงไปใช้งานได้ง่าย 

    //Method
    public void setID(String id){ //สร้าง Method เพื่อเรียกใช้ ไปกำหนดค่า
        this.id=id; 
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void displayEmployee(){ //ดีงข้อมูลมาทั้งหมด
        System.out.println("Nane = "+this.name);
        System.out.println("Salary = "+this.salary);
    }

    //ดึงข้อมูลเฉพาะ
    public String getName(){ //ดึงด้วย Data Type String
        return this.name; //ส่งค่า name ออกไป
    }
    public String getID(){
        return this.id;
    }
    public Double getSalary(){
        return this.salary;
    }
}
