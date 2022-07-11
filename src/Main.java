public class Main {

    public static void main(String[] args) {
        Transport taxi = new Car();
        taxi.name = "Taxi";
        taxi.status();
        taxi.addPassenger();
        taxi.beep();
        taxi.start();
        taxi.status();
        taxi.status();
        taxi.stop();
        taxi.status();

        Transport truck = new Truck();
        truck.name = "AutoTruck";
        truck.status();
        truck.addPassenger();
        truck.addCargo(4);
        truck.addCargo(1);
        truck.status();


        Transport bike = new Bike();
        bike.name = "Suzuki";
        bike.status();
        bike.addPassenger();
        bike.addPassenger();
        bike.addPassenger();
        bike.addPassenger();
        bike.addCargo(4);
        bike.addCargo(1);
        bike.status();
    }

}