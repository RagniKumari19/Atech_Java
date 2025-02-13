public class heirarchicalInheritance {
    public static void main(String[] args) {
        Teacher te = new Teacher();
        te.display("Sanjay Kumar", "Teacher", "8:00 AM", "Scooter", 45000L);
        te.teacher();

        Student st= new Student();
        st.display("Rohan", "Student", "8:45 AM", "School Bus", 0);
        st.student();

        Staff sta = new Staff();
        sta.display("Vivek kumar", "Staff", "7:00 AM", "By own", 25000L);
        sta.staff();
    }
}
class School{
    String name;
    String designation;
    String timing;
    String modeOfTravelling;
    long salary;

    void display(String name, String designation, String timing,String modeOfTravelling,long salary){
        this.name=name;
        this.designation = designation;
        this.timing = timing;
        this.modeOfTravelling = modeOfTravelling;
        this.salary = salary;
        System.out.println("Name of the person "+name+" , designation is "+designation+" , timing is " +
                timing+" ,mode of travelling is "+modeOfTravelling+"  and salary is"+salary);
    }
}
class Teacher extends School{
    void teacher(){
        System.out.println("They get salary from school");
        System.out.println("\n and they teach students");
    }
}
class Student extends School{
    void student(){
        System.out.println("Students pay fees in school");
        System.out.println("\n and they participate in new activities");
    }
}
class Staff extends School{
    void staff(){
        System.out.println("Staff arrives at school first");
        System.out.println("\n and they keep the school clean and maintain things");
    }

}
