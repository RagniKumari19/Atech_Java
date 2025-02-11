public class constructorOverloading {
    public static void main(String[] args){

             Phone p1= new Phone("Samsung", "samsung A52", 2021, "Snapdragon 720G");
             p1.display();
             Phone p2 = new Phone();
             p2.display();
    }
}
class Phone{

    String name;
    String model;
    int launchYear;
    String processor;
    String chargingPort;
    int storage;
    int simCardSlot;
      Phone( String name,String model,int launchYear,String processor) {
         this.name = name;
         this.model = model;
         this.launchYear= launchYear;
         this.processor= processor;
     }
     Phone(){
         name = "vivo";
         model = "vivo v40";
         processor ="Qualcomm Snapdragon 7 Gen 3";

     }
    Phone( String name,String model,int launchYear,String processor,int storage,int simCardSlot){
         this.name = name;
         this.model = model;
         this.launchYear = launchYear;
         this.processor= processor;
         this.storage = storage;
         this.simCardSlot=simCardSlot;
     }
    void display(){
             System.out.println("Name of the company "+ name +", model is "+model+ "launch year is "+launchYear+
                     "Processor is"+processor);
         }
}
