public class oopsTask {
    public static void main(String[] args) {
      Mobile1();
      Mobile2();
    }
    public static void Mobile1(){
        Mobile m1 = new Mobile();
        m1.name ="Samsung";
        m1.model ="Samsung Galaxy S24";
        m1.launchYear = 2024;
        m1.display = "Dynamic AMOLED Display";
        m1.processor = "Snapdragon 8 Gen 3";
        m1.chargingPort ="Type c";
        m1.storage = 256;
        m1.simCardSlot = 2;

        System.out.println("Name of the company " + m1.name + ", model is " + m1.model + ", launchYear is "
                + m1.launchYear + ", display is " + m1.display + ", processor is " + m1.processor + ", Charging prt is " + m1.chargingPort +
                ", Storage is " + m1.storage + ", SimCard slot is " + m1.simCardSlot);
    }

    private static void Mobile2() {
        Mobile m2 = new Mobile();
        m2.name ="Vivo";
        m2.model ="Vivo V27";
        m2.launchYear = 2023;
        m2.display = " AMOLED Display";
        m2.processor = "MediaTek Dimensity 7200";
        m2.chargingPort ="Type c";
        m2.storage = 128;
        m2.simCardSlot = 2;
        System.out.println("Name of the company "+ m2.name +", model is "+m2.model+ " , launchYear is "
                +m2.launchYear+ " , display is "+m2.display+ ",  processor is "+m2.processor+", Charging prt is "+m2.chargingPort+
                ", Storage is "+m2.storage+" ,  SimCard slot is "+m2.simCardSlot);
    }
}
class Mobile{
    String name;
    String model;
    String display;
    String processor;
    String chargingPort;
    int storage;
    int simCardSlot;
    int launchYear;
}
