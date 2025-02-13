public class MultiLayerInheritance {
    public static void main(String[] args) {
        CEO c = new CEO();
        System.out.println("About CEO");
        c.display("lovely", "CEO", 120000L, 6734096745L);
        c.decision();

        CFO cf = new CFO();
        System.out.println("About CFO");
        cf.display("Rohit", "CFO", 980000L,  8745097843L);
        cf.finanace();

    }
}
class Manager{
    String name;
    String designation;
    long salary;
    long phoneNumber;

    void display(String name, String designation, long salary,long phoneNumber){
        this.name  = name;
        this.designation = designation;
        this.salary = salary;
        this.phoneNumber = phoneNumber;

        System.out.println("Employee name is "+name + "\ndesignation is "+designation+
                "\n salary is "+salary+"\nphone number is "+phoneNumber);
        System.out.println("\n");
    }
}
class CFO extends Manager{
    void finanace(){
        System.out.println(" analyzing the company's financial strengths and weaknesses " +
                "and proposing corrective actions.");
        System.out.println("\n and tracking cash flow and financial planning ");
    }
}
class CEO extends CFO{
    void decision(){
        System.out.println("The CEO is the highest-ranking role in the organization");
        System.out.println("\n and He\\She in the charge of keeping the employees on track to meet" +
                " the vision of the company in the long term");

    }

}


