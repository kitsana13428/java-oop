package company;
public class Programmer extends Employee{
    
    //overloading method
    public void skill(){
        System.out.println("No Skill");
    }
    
    public void skill(String...language){ //รับค่าเป็นอาเรย์ รับได้หลายๆตัว
        for(int i=0;i<language.length;i++){ //ลูปค่าอาเรย์ออกมา
            System.out.println("Skill = "+language[i]);
        }
    }
    public void bonus(){
       System.out.println("Bonus = 10%");
    }
    
    
    
}
