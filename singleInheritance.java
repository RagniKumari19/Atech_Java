public class singleInheritance {
    public static void main(String[] args) {
        mechanic me = new mechanic();
          me.display(25,30, "Brake Shoes ", "Piston");
    }
}
class gearShop{
    int ridingBoots;
    int ridingGloves;
    String brakingSystem;
    String enginePart;

    void display(int ridingBoots, int ridingGloves, String brakingSystem, String enginePart){
        this.ridingBoots = ridingBoots;
        this.ridingGloves = ridingGloves;
        this.brakingSystem = brakingSystem;
        this.enginePart = enginePart;
        System.out.println("Number of riding boots are = "+ridingBoots+"\n number of riding gloves are =  "
        +ridingGloves+"\n braking System is "+brakingSystem+ "\n engine part is "+enginePart);
    }

}
class mechanic extends gearShop{

}
