public class Emp {
    public static void main(String[] args){
        Employee employee = new Employee("Ragni",47698,1200000);
        System.out.println(employee.getName());
        System.out.println(employee.getEmployeeID());
        System.out.println(employee.getSalary());

        System.out.println("updated version");
        employee.setName("Mani");
        employee.setEmployeeID(4576);
        employee.setSalary(67000);
        System.out.println(employee.getName());
        System.out.println(employee.getEmployeeID());
        System.out.println(employee.getSalary());
    }
}
class Employee{
     private String name;
     private int employeeID;
     private int salary;

     public Employee(String name, int employeeID, int salary){
         this.name = name;
         this.employeeID=employeeID;
         this.salary=salary;
     }
     public String getName(){
         return name;
     }
     public int getEmployeeID(){
         return employeeID;
     }
     public int getSalary(){
         return salary;
     }
    public void setName(String name){
         this.name=name;
    }
    public void setEmployeeID(int employeeID){
         this.employeeID=employeeID;
    }
    public void setSalary(int salary){
         if(salary>=0){
             this.salary=salary;
         }
         else{
             System.out.println("Invalid value");
         }
    }
}
