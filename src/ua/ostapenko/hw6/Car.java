package ua.ostapenko.hw6;


public class Car {


    public static void main(String[] args) {
        Car1 bmw = new Car1(Manufacturer.bmw,"diesel","black", 20);
        bmw.isEnoughPetrolLevel();
        bmw.startEngine();

        Car1 audi1 = new Car1();
        audi1.setColor("yellow");
        audi1.setManufacturer(Manufacturer.audi);
        audi1.setEngine("diesel");
        audi1.setPetrol(54);
        audi1.isEnoughPetrolLevel();
        audi1.startEngine();

        bmw.setPetrol(80);
        bmw.isEnoughPetrolLevel();
        bmw.startEngine();
    }
}

enum Manufacturer{

    audi,
    bmw,
    suzuki,
    opel,
    ford,
    jeep,
    lexus
}

 class Car1 {

   private   Manufacturer manufacturer;
    private String engine;
    private  String color;
    private  int petrol;

    public Car1 (Manufacturer manufacturer, String engine, String color, int petrol) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.petrol = petrol;
    }

     public Car1 () {

     }

//     public Car1 (String manufacturer) {
//         this.manufacturer = manufacturer;
//     }

     public void setManufacturer(Manufacturer manufacturer) {
         this.manufacturer = manufacturer;
     }
     public void setEngine(String engine) {
         this.engine = engine;
     }
     public void setColor(String color) {
         this.color = color;
     }
     public void setPetrol(int petrol) {
         if( petrol < 0){
             this.petrol =0;
         }
         else if( petrol > 100) {
             this.petrol = 100;
         }
         else{
             this.petrol = petrol;
         }
     }

     public void startEngine(){
         System.out.println(this.manufacturer + " started engine");
     }
     public boolean isEnoughPetrolLevel() {
         if (this.petrol > 50) {
             System.out.println(true);
             return true;
         } else {
             System.out.println(false);
             return false;
         }
     }

//     public void toString1(){
         //System.out.println("данные "+ "manufacturer " + this.manufacturer+ " color "+ this.color + " petrol " + this.petrol);
     //}

 }
