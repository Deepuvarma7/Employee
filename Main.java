class Employee{
    private String name;
    private  int id;
    private double salary;
    private String email;
    private String department;

    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getid(){
      return id; 
    }
    public void setid(int id){
        this.id = id;
    }
    public  double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
       this.salary = salary;
    }
    public String getdepartment(){
        return department;
    }
    public void setdepartment(String department){
        this.department=department;
    } 
}
public class Main {
public static void main(String[] args){
     Employee employee = new Employee();
     employee.setName("java");
     employee.setid(1);
     employee.setsalary(30000.98);
     employee.setdepartment("Mca");
     System.out.println(employee.getName());
     System.out.println(employee.getid());
     System.out.println(employee.getsalary());
     System.out.println(employee.getdepartment());
}
}
